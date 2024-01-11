package com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.skin

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class WeaponSkin(
    @PrimaryKey
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("chromas")
    val skinChromas: List<SkinChroma>?,
    @SerializedName("contentTierUuid")
    val skinContentTierUuid: String?,
    @SerializedName("displayIcon")
    val skinDisplayIcon: String?,
    @SerializedName("displayName")
    val skinDisplayName: String?,
    @SerializedName("levels")
    val skinLevels: List<SkinLevel>?,
    @SerializedName("themeUuid")
    val skinThemeUuid: String?,
    @SerializedName("wallpaper")
    val skinWallpaper: String?
)