package com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.stats

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class StatDamageRange(
    @PrimaryKey(autoGenerate = true)
    val statId: Int,
    @SerializedName("bodyDamage")
    val statBodyDamage: Int?,
    @SerializedName("headDamage")
    val statHeadDamage: Double?,
    @SerializedName("legDamage")
    val statLegDamage: Double?,
    @SerializedName("rangeEndMeters")
    val statRangeEndMeters: Int?,
    @SerializedName("rangeStartMeters")
    val statRangeStartMeters: Int?
)