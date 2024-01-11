package com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasourceImpl

import com.ibrahimcanerdogan.masterplayerguide.data.model.map.Map
import com.ibrahimcanerdogan.masterplayerguide.data.remote.APIService
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasource.MapRemoteDataSource
import retrofit2.Response
import javax.inject.Inject

class MapRemoteDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : MapRemoteDataSource {

    override suspend fun getMapFromRemote(): Response<Map> {
        return apiService.getMapRemote()
    }
}