package com.ibrahimcanerdogan.masterplayerguide.view.dependencyinjection

import com.ibrahimcanerdogan.masterplayerguide.domain.repository.AgentRepository
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.MapRepository
import com.ibrahimcanerdogan.masterplayerguide.domain.repository.WeaponRepository
import com.ibrahimcanerdogan.masterplayerguide.domain.usecase.GetAgentUseCase
import com.ibrahimcanerdogan.masterplayerguide.domain.usecase.GetMapUseCase
import com.ibrahimcanerdogan.masterplayerguide.domain.usecase.GetWeaponUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun provideGetAgentUseCase(
        agentRepository: AgentRepository
    ) : GetAgentUseCase {
        return GetAgentUseCase(agentRepository)
    }

    @Singleton
    @Provides
    fun provideGetMapUseCase(
        mapRepository: MapRepository
    ) : GetMapUseCase {
        return GetMapUseCase(mapRepository)
    }

    @Singleton
    @Provides
    fun provideGetWeaponUseCase(
        weaponRepository: WeaponRepository
    ) : GetWeaponUseCase {
        return GetWeaponUseCase(weaponRepository)
    }
}