package com.ibrahimcanerdogan.masterplayerguide.view.dependencyinjection

import android.app.Application
import androidx.room.Room
import com.ibrahimcanerdogan.masterplayerguide.data.database.ValorantDatabase
import com.ibrahimcanerdogan.masterplayerguide.data.database.agent.AgentDao
import com.ibrahimcanerdogan.masterplayerguide.data.database.map.MapDao
import com.ibrahimcanerdogan.masterplayerguide.data.database.weapon.WeaponDao
import com.ibrahimcanerdogan.masterplayerguide.util.AppConstant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    @Singleton
    @Provides
    fun provideValorantDatabase(app : Application) : ValorantDatabase {
        return Room.databaseBuilder(app, ValorantDatabase::class.java, AppConstant.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideAgentDao(valorantDatabase: ValorantDatabase) : AgentDao {
        return valorantDatabase.agentDao()
    }

    @Singleton
    @Provides
    fun provideMapDao(valorantDatabase: ValorantDatabase) : MapDao {
        return valorantDatabase.mapDao()
    }

    @Singleton
    @Provides
    fun provideWeaponDao(valorantDatabase: ValorantDatabase) : WeaponDao {
        return valorantDatabase.weaponDao()
    }
}