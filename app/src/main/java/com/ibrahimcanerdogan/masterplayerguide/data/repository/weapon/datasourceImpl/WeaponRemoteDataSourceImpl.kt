package com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasourceImpl

import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.Weapon
import com.ibrahimcanerdogan.masterplayerguide.data.remote.APIService
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasource.WeaponRemoteDataSource
import retrofit2.Response
import javax.inject.Inject

class WeaponRemoteDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : WeaponRemoteDataSource {

    override suspend fun getWeaponFromRemote(): Response<Weapon> {
        return apiService.getWeaponRemote()
    }
}