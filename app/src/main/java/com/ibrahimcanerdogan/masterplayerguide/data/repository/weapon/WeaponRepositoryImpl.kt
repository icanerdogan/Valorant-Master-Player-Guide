package com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon

import android.util.Log
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.Weapon
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.WeaponData
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasource.WeaponLocalDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasource.WeaponRemoteDataSource
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.WeaponRepository
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

class WeaponRepositoryImpl @Inject constructor(
    private val weaponRemoteDataSource: WeaponRemoteDataSource,
    private val weaponLocalDataSource: WeaponLocalDataSource
) : WeaponRepository {

    override suspend fun getAllWeaponsFromRepository(): Resource<List<WeaponData>> {
        lateinit var listWeaponData : Resource<List<WeaponData>>

        try {
            listWeaponData = weaponLocalDataSource.getWeaponDataFromLocal()
        } catch (e: Exception) {
            Log.e(TAG, e.message.toString())
        }

        if (listWeaponData.data!!.isNotEmpty()) {
            return listWeaponData
        } else {
            listWeaponData = responseToResource(weaponRemoteDataSource.getWeaponFromRemote())
            weaponLocalDataSource.saveWeaponDataToLocal(listWeaponData.data!!)
        }

        return listWeaponData
    }

    private fun responseToResource(response : Response<Weapon>) : Resource<List<WeaponData>> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it.weapons)
            }
        }
        return Resource.Error(response.message())
    }

    companion object {
        private val TAG = WeaponRepositoryImpl::class.java.toString()
    }
}