package com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasource

import com.ibrahimcanerdogan.masterplayerguide.data.model.map.MapData
import com.ibrahimcanerdogan.masterplayerguide.util.Resource

interface MapLocalDataSource {

    suspend fun saveMapDataToLocal(listMapData : List<MapData>)

    suspend fun getMapDataFromLocal() : Resource<List<MapData>>
}