package com.ibrahimcanerdogan.masterplayerguide.view.dependencyinjection

import com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.AgentRepositoryImpl
import com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasource.AgentLocaleDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasource.AgentRemoteDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.MapRepositoryImpl
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasource.MapLocalDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasource.MapRemoteDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.WeaponRepositoryImpl
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasource.WeaponLocalDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasource.WeaponRemoteDataSource
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.AgentRepository
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.MapRepository
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.WeaponRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideAgentRepository(
        remoteDataSource: AgentRemoteDataSource,
        localeDataSource: AgentLocaleDataSource
    ) : AgentRepository {
        return AgentRepositoryImpl(remoteDataSource, localeDataSource)
    }

    @Singleton
    @Provides
    fun provideMapRepository(
        mapRemoteDataSource: MapRemoteDataSource,
        mapLocalDataSource: MapLocalDataSource
    ) : MapRepository {
        return MapRepositoryImpl(mapRemoteDataSource, mapLocalDataSource)
    }

    @Singleton
    @Provides
    fun provideWeaponRepository(
        weaponRemoteDataSource: WeaponRemoteDataSource,
        weaponLocalDataSource: WeaponLocalDataSource
    ): WeaponRepository {
        return WeaponRepositoryImpl(weaponRemoteDataSource, weaponLocalDataSource)
    }

}