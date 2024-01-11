package com.ibrahimcanerdogan.masterplayerguide.data.model.agent

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class AgentRole(
    @PrimaryKey
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("description")
    val roleDescription: String,
    @SerializedName("displayIcon")
    val roleDisplayIcon: String,
    @SerializedName("displayName")
    val roleDisplayName: String
)