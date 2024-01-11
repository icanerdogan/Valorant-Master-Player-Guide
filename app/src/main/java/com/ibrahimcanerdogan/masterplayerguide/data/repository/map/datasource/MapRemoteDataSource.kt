package com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasource

import com.ibrahimcanerdogan.masterplayerguide.data.model.map.Map
import retrofit2.Response

interface MapRemoteDataSource {

    suspend fun getMapFromRemote() : Response<Map>
}