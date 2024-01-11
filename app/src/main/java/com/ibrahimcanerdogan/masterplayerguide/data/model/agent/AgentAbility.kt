package com.ibrahimcanerdogan.masterplayerguide.data.model.agent

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class AgentAbility(
    @PrimaryKey(autoGenerate = true)
    val abilityID: Int,
    @SerializedName("description")
    val abilityDescription: String,
    @SerializedName("displayIcon")
    val abilityDisplayIcon: String,
    @SerializedName("displayName")
    val abilityDisplayName: String,
    @SerializedName("slot")
    val abilitySlot: String
)