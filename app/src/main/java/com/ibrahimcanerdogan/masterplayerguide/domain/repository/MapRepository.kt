package com.ibrahimcanerdogan.masterplayerguide.domain.repository

import com.ibrahimcanerdogan.masterplayerguide.data.model.map.MapData
import com.ibrahimcanerdogan.masterplayerguide.util.Resource

interface MapRepository {

    suspend fun getAllMapsFromRepository() : Resource<List<MapData>>
}