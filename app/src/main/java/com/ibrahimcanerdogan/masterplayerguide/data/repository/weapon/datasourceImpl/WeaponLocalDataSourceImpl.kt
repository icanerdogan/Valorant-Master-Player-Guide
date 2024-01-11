package com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasourceImpl

import com.ibrahimcanerdogan.masterplayerguide.data.database.weapon.WeaponDao
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.WeaponData
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasource.WeaponLocalDataSource
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import javax.inject.Inject

class WeaponLocalDataSourceImpl @Inject constructor(
    private val weaponDao: WeaponDao
) : WeaponLocalDataSource {

    override suspend fun saveWeaponDataToLocal(weaponList: List<WeaponData>) {
        return weaponDao.saveWeaponDatabase(weaponList)
    }

    override suspend fun getWeaponDataFromLocal(): Resource<List<WeaponData>> {
        return Resource.Success(weaponDao.getWeaponListDatabase())
    }
}