package com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.stats

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class WeaponStats(
    @PrimaryKey(autoGenerate = true)
    val statId: Int,
    @SerializedName("adsStats")
    val statAdsStats: StatAds?,
    @SerializedName("airBurstStats")
    val statAirBurstStats: StatAirBurst?,
    @SerializedName("altFireType")
    val statAltFireType: String?,
    @SerializedName("altShotgunStats")
    val statAltShotgunStats: StatAltShotgun?,
    @SerializedName("damageRanges")
    val statDamageRanges: List<StatDamageRange>?,
    @SerializedName("equipTimeSeconds")
    val statEquipTimeSeconds: Double?,
    @SerializedName("feature")
    val statFeature: String?,
    @SerializedName("fireMode")
    val statFireMode: String?,
    @SerializedName("fireRate")
    val statFireRate: Double?,
    @SerializedName("firstBulletAccuracy")
    val statFirstBulletAccuracy: Double?,
    @SerializedName("magazineSize")
    val statMagazineSize: Int?,
    @SerializedName("reloadTimeSeconds")
    val statReloadTimeSeconds: Double?,
    @SerializedName("runSpeedMultiplier")
    val statRunSpeedMultiplier: Double?,
    @SerializedName("shotgunPelletCount")
    val statShotgunPelletCount: Int?,
    @SerializedName("wallPenetration")
    val statWallPenetration: String?
)