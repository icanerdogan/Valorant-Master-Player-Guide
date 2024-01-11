package com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.stats

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class StatAltShotgun(
    @PrimaryKey(autoGenerate = true)
    val statId: Int,
    @SerializedName("burstRate")
    val statBurstRate: Double?,
    @SerializedName("shotgunPelletCount")
    val statShotgunPelletCount: Int?
)