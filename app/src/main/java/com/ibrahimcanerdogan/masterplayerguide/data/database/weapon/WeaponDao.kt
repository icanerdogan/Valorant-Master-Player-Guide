package com.ibrahimcanerdogan.masterplayerguide.data.database.weapon

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.WeaponData

@Dao
interface WeaponDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveWeaponDatabase(weaponList: List<WeaponData>)

    @Query("SELECT * FROM weapon_data")
    fun getWeaponListDatabase(): List<WeaponData>
}