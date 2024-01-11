package com.ibrahimcanerdogan.masterplayerguide.data.model.weapon

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.shop.WeaponShopData
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.skin.WeaponSkin
import com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.stats.WeaponStats
@Entity(
    tableName = "weapon_data"
)
data class WeaponData(
    @PrimaryKey
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("category")
    val weaponCategory: String,
    @SerializedName("defaultSkinUuid")
    val weaponDefaultSkinUuid: String,
    @SerializedName("displayIcon")
    val weaponDisplayIcon: String,
    @SerializedName("displayName")
    val weaponDisplayName: String,
    @SerializedName("killStreamIcon")
    val weaponKillStreamIcon: String,
    @SerializedName("shopData")
    val weaponShopData: WeaponShopData?,
    @SerializedName("skins")
    val weaponSkins: List<WeaponSkin>,
    @SerializedName("weaponStats")
    val weaponStats: WeaponStats?
)