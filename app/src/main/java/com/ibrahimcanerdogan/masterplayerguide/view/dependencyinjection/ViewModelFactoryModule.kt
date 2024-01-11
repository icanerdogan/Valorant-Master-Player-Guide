package com.ibrahimcanerdogan.masterplayerguide.view.dependencyinjection

import android.app.Application
import com.ibrahimcanerdogan.masterplayerguide.domain.usecase.GetAgentUseCase
import com.ibrahimcanerdogan.masterplayerguide.domain.usecase.GetMapUseCase
import com.ibrahimcanerdogan.masterplayerguide.domain.usecase.GetWeaponUseCase
import com.ibrahimcanerdogan.masterplayerguide.view.viewmodel.agent.AgentViewModelFactory
import com.ibrahimcanerdogan.masterplayerguide.view.viewmodel.map.MapViewModelFactory
import com.ibrahimcanerdogan.masterplayerguide.view.viewmodel.weapon.WeaponViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ViewModelFactoryModule {

    @Singleton
    @Provides
    fun provideAgentViewModelFactory(
        application: Application,
        getAgentUseCase: GetAgentUseCase
    ) : AgentViewModelFactory {
        return AgentViewModelFactory(application, getAgentUseCase)
    }

    @Singleton
    @Provides
    fun provideMapViewModelFactory(
        application: Application,
        getMapUseCase: GetMapUseCase
    ) : MapViewModelFactory {
        return MapViewModelFactory(application, getMapUseCase)
    }

    @Singleton
    @Provides
    fun provideWeaponViewModelFactory(
        application: Application,
        getWeaponUseCase: GetWeaponUseCase
    ) : WeaponViewModelFactory {
        return WeaponViewModelFactory(application, getWeaponUseCase)
    }
}