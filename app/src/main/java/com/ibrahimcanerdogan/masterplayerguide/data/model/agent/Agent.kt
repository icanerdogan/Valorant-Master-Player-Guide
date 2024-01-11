package com.ibrahimcanerdogan.masterplayerguide.data.model.agent

import com.google.gson.annotations.SerializedName

data class Agent(
    @SerializedName("data")
    val agents: List<AgentData>,
    @SerializedName("status")
    val status: Int
)