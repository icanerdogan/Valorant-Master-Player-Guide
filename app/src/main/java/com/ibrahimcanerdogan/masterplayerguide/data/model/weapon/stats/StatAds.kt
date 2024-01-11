package com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.stats

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class StatAds(
    @PrimaryKey(autoGenerate = true)
    val statId: Int,
    @SerializedName("burstCount")
    val statBurstCount: Int?,
    @SerializedName("fireRate")
    val statFireRate: Double?,
    @SerializedName("firstBulletAccuracy")
    val statFirstBulletAccuracy: Double?,
    @SerializedName("runSpeedMultiplier")
    val statRunSpeedMultiplier: Double?,
    @SerializedName("zoomMultiplier")
    val statZoomMultiplier: Double?
)