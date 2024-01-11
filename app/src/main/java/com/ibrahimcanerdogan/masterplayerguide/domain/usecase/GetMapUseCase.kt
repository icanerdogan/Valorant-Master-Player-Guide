package com.ibrahimcanerdogan.masterplayerguide.domain.usecase

import com.ibrahimcanerdogan.masterplayerguide.data.model.map.MapData
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.MapRepository
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import javax.inject.Inject

class GetMapUseCase @Inject constructor(
    private val mapRepository: MapRepository
) {

    suspend fun execute() : Resource<List<MapData>> {
        return mapRepository.getAllMapsFromRepository()
    }
}