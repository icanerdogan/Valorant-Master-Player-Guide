package com.ibrahimcanerdogan.masterplayerguide.data.repository.map

import android.util.Log
import com.ibrahimcanerdogan.masterplayerguide.data.model.map.Map
import com.ibrahimcanerdogan.masterplayerguide.data.model.map.MapData
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasource.MapLocalDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasource.MapRemoteDataSource
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.MapRepository
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import retrofit2.Response
import javax.inject.Inject

class MapRepositoryImpl @Inject constructor(
    private val mapRemoteDataSource: MapRemoteDataSource,
    private val mapLocalDataSource: MapLocalDataSource
) : MapRepository {

    override suspend fun getAllMapsFromRepository(): Resource<List<MapData>> {
        lateinit var listMapData : Resource<List<MapData>>

        try {
            listMapData = mapLocalDataSource.getMapDataFromLocal()
        } catch (e : Exception) {
            Log.e("MapRepositoryImpl", e.message.toString())
        }

        if (listMapData.data!!.isNotEmpty()) {
            return listMapData
        } else {
            listMapData = responseToResource(mapRemoteDataSource.getMapFromRemote())
            mapLocalDataSource.saveMapDataToLocal(listMapData.data!!)
        }

        return listMapData
    }

    private fun responseToResource(response: Response<Map>) : Resource<List<MapData>>{
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it.maps)
            }
        }
        return Resource.Error(response.message())
    }
}