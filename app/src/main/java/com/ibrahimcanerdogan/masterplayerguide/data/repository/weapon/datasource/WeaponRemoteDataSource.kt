package com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasource

import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.Weapon
import retrofit2.Response

interface WeaponRemoteDataSource {

    suspend fun getWeaponFromRemote() : Response<Weapon>
}