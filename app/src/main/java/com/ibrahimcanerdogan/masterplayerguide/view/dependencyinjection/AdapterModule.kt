package com.ibrahimcanerdogan.masterplayerguide.view.dependencyinjection

import com.ibrahimcanerdogan.masterplayerguide.view.adapter.agent.AgentAdapter
import com.ibrahimcanerdogan.masterplayerguide.view.adapter.map.MapAdapter
import com.ibrahimcanerdogan.masterplayerguide.view.adapter.weapon.WeaponAdapter
import com.ibrahimcanerdogan.masterplayerguide.view.adapter.weapon.WeaponDamageRangeAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AdapterModule {

    @Singleton
    @Provides
    fun provideAgentAdapter() : AgentAdapter {
        return AgentAdapter()
    }

    @Singleton
    @Provides
    fun provideMapAdapter() : MapAdapter {
        return MapAdapter()
    }

    @Singleton
    @Provides
    fun provideWeaponAdapter() : WeaponAdapter {
        return WeaponAdapter()
    }

    @Singleton
    @Provides
    fun provideWeaponDamageRangeAdapter() : WeaponDamageRangeAdapter {
        return WeaponDamageRangeAdapter()
    }
}