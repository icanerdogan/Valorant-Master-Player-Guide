package com.ibrahimcanerdogan.masterplayerguide.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ibrahimcanerdogan.masterplayerguide.data.database.agent.AgentDao
import com.ibrahimcanerdogan.masterplayerguide.data.database.map.MapDao
import com.ibrahimcanerdogan.masterplayerguide.data.database.weapon.WeaponDao
import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentData
import com.ibrahimcanerdogan.masterplayerguide.data.model.map.MapData
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.WeaponData

@Database(
    entities = [AgentData::class, MapData::class, WeaponData::class],
    version = 3,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class ValorantDatabase : RoomDatabase() {

    abstract fun agentDao() : AgentDao

    abstract fun mapDao() : MapDao

    abstract fun weaponDao() : WeaponDao
}