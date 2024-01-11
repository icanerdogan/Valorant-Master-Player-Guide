package com.ibrahimcanerdogan.masterplayerguide.domain.usecase

import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.WeaponData
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.WeaponRepository
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import javax.inject.Inject

class GetWeaponUseCase @Inject constructor(
    private val weaponRepository: WeaponRepository
){

    suspend fun execute() : Resource<List<WeaponData>> {
        return weaponRepository.getAllWeaponsFromRepository()
    }
}