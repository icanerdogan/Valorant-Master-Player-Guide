package com.ibrahimcanerdogan.masterplayerguide.domain.repository

import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.WeaponData
import com.ibrahimcanerdogan.masterplayerguide.util.Resource

interface WeaponRepository {

    suspend fun getAllWeaponsFromRepository() : Resource<List<WeaponData>>
}