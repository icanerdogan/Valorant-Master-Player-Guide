package com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.stats

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class StatAirBurst(
    @PrimaryKey(autoGenerate = true)
    val statId: Int,
    @SerializedName("burstDistance")
    val statBurstDistance: Double?,
    @SerializedName("shotgunPelletCount")
    val statShotgunPelletCount: Int?
)