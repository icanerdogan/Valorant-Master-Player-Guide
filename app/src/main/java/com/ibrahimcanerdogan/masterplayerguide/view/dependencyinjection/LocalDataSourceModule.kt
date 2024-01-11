package com.ibrahimcanerdogan.masterplayerguide.view.dependencyinjection

import com.ibrahimcanerdogan.masterplayerguide.data.database.agent.AgentDao
import com.ibrahimcanerdogan.masterplayerguide.data.database.map.MapDao
import com.ibrahimcanerdogan.masterplayerguide.data.database.weapon.WeaponDao
import com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasource.AgentLocaleDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasourceImpl.AgentLocalDataSourceImpl
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasource.MapLocalDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasourceImpl.MapLocalDataSourceImpl
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasource.WeaponLocalDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasourceImpl.WeaponLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataSourceModule {

    @Singleton
    @Provides
    fun provideAgentLocalDataSource(
        agentDao: AgentDao
    ) : AgentLocaleDataSource {
        return AgentLocalDataSourceImpl(agentDao)
    }

    @Singleton
    @Provides
    fun provideMapLocalDataSource(
        mapDao: MapDao
    ): MapLocalDataSource {
        return MapLocalDataSourceImpl(mapDao)
    }

    @Singleton
    @Provides
    fun provideWeaponLocalDataSource(
        weaponDao: WeaponDao
    ) : WeaponLocalDataSource {
        return WeaponLocalDataSourceImpl(weaponDao)
    }
}