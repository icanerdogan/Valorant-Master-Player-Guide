package com.ibrahimcanerdogan.masterplayerguide.data.database

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentAbility
import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentRecruitmentData
import com.ibrahimcanerdogan.masterplayerguide.data.model.agent.AgentRole
import com.ibrahimcanerdogan.masterplayerguide.data.model.map.MapCallout
import com.ibrahimcanerdogan.masterplayerguide.data.model.map.MapData
import com.ibrahimcanerdogan.masterplayerguide.data.model.map.MapLocation
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.shop.WeaponShopData
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.skin.WeaponSkin
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.stats.WeaponStats

class Converters {

    private val gson = Gson()

    @TypeConverter
    fun fromAgentAbilitiesList(agentAbilities: List<AgentAbility>): String {
        return gson.toJson(agentAbilities)
    }

    @TypeConverter
    fun toAgentAbilitiesList(agentAbilitiesString: String): List<AgentAbility> {
        val listType = object : TypeToken<List<AgentAbility>>() {}.type
        return gson.fromJson(agentAbilitiesString, listType)
    }

    @TypeConverter
    fun fromStringList(stringList: List<String>?): String? {
        return gson.toJson(stringList)
    }

    @TypeConverter
    fun toStringList(stringListString: String?): List<String>? {
        val listType = object : TypeToken<List<String>?>() {}.type
        return gson.fromJson(stringListString, listType)
    }

    @TypeConverter
    fun fromAgentRecruitmentData(agentRecruitmentData: AgentRecruitmentData?): String? {
        return gson.toJson(agentRecruitmentData)
    }

    @TypeConverter
    fun toAgentRecruitmentData(agentRecruitmentDataString: String?): AgentRecruitmentData? {
        return gson.fromJson(agentRecruitmentDataString, AgentRecruitmentData::class.java)
    }

    @TypeConverter
    fun fromAgentRole(role: AgentRole?): String? {
        return gson.toJson(role)
    }

    @TypeConverter
    fun toAgentRole(roleString: String?): AgentRole? {
        return gson.fromJson(roleString, AgentRole::class.java)
    }

    // MAP

    @TypeConverter
    fun fromMapData(mapData: MapData): String {
        return gson.toJson(mapData)
    }

    @TypeConverter
    fun toMapData(json: String): MapData {
        val type = object : TypeToken<MapData>() {}.type
        return gson.fromJson(json, type)
    }

    @TypeConverter
    fun fromMapCalloutList(mapCallouts: List<MapCallout>?): String? {
        return gson.toJson(mapCallouts)
    }

    @TypeConverter
    fun toMapCalloutList(json: String?): List<MapCallout>? {
        val type = object : TypeToken<List<MapCallout>>() {}.type
        return gson.fromJson(json, type)
    }

    @TypeConverter
    fun fromMapLocation(mapLocation: MapLocation): String {
        return gson.toJson(mapLocation)
    }

    @TypeConverter
    fun toMapLocation(json: String): MapLocation {
        val type = object : TypeToken<MapLocation>() {}.type
        return gson.fromJson(json, type)
    }

    // WEAPON

    @TypeConverter
    fun fromWeaponStat(weaponStats: WeaponStats?): String {
        return gson.toJson(weaponStats)
    }

    @TypeConverter
    fun toWeaponStat(json: String): WeaponStats? {
        return gson.fromJson(json, WeaponStats::class.java)
    }


    @TypeConverter
    fun fromWeaponSkinList(weaponSkins: List<WeaponSkin>?): String? {
        return gson.toJson(weaponSkins)
    }

    @TypeConverter
    fun toWeaponSkinList(json: String?): List<WeaponSkin>? {
        val type = object : TypeToken<List<WeaponSkin>>() {}.type
        return gson.fromJson(json, type)
    }


    @TypeConverter
    fun fromWeaponShop(weaponShop: WeaponShopData?): String {
        return gson.toJson(weaponShop)
    }

    @TypeConverter
    fun toWeaponShop(json: String): WeaponShopData? {
        return gson.fromJson(json, WeaponShopData::class.java)
    }

}