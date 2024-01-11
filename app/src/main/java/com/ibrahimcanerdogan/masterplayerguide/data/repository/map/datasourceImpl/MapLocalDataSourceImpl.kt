package com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasourceImpl

import com.ibrahimcanerdogan.masterplayerguide.data.database.map.MapDao
import com.ibrahimcanerdogan.masterplayerguide.data.model.map.MapData
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasource.MapLocalDataSource
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import javax.inject.Inject

class MapLocalDataSourceImpl @Inject constructor(
    private val mapDao: MapDao
) : MapLocalDataSource {

    override suspend fun saveMapDataToLocal(listMapData: List<MapData>) {
        return mapDao.saveMapDatabase(listMapData)
    }

    override suspend fun getMapDataFromLocal(): Resource<List<MapData>> {
        return Resource.Success(mapDao.getMapListDatabase())
    }
}