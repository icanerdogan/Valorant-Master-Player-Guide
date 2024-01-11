package com.ibrahimcanerdogan.masterplayerguide.view.dependencyinjection

import com.ibrahimcanerdogan.masterplayerguide.data.remote.APIService
import com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasource.AgentRemoteDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.agent.datasourceImpl.AgentRemoteDataSourceImpl
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasource.MapRemoteDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.map.datasourceImpl.MapRemoteDataSourceImpl
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasource.WeaponRemoteDataSource
import com.ibrahimcanerdogan.masterplayerguide.data.repository.weapon.datasourceImpl.WeaponRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataSourceModule {

    @Singleton
    @Provides
    fun provideAgentRemoteDataSource(
        apiService: APIService
    ) : AgentRemoteDataSource {
        return AgentRemoteDataSourceImpl(apiService)
    }

    @Singleton
    @Provides
    fun provideMapRemoteDataSource(
        apiService: APIService
    ) : MapRemoteDataSource {
        return MapRemoteDataSourceImpl(apiService)
    }

    @Singleton
    @Provides
    fun provideWeaponRemoteDataSource(
        apiService: APIService
    ) : WeaponRemoteDataSource {
        return WeaponRemoteDataSourceImpl(apiService)
    }
}