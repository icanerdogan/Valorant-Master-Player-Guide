package com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasource

import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.WeaponData
import com.ibrahimcanerdogan.masterplayerguide.util.Resource

interface WeaponLocalDataSource {

    suspend fun saveWeaponDataToLocal(weaponList : List<WeaponData>)

    suspend fun getWeaponDataFromLocal() : Resource<List<WeaponData>>
}