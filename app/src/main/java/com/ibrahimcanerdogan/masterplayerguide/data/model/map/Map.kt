package com.ibrahimcanerdogan.masterplayerguide.data.model.map

import com.google.gson.annotations.SerializedName

data class Map(
    @SerializedName("data")
    val maps: List<MapData>,
    @SerializedName("status")
    val status: Int
)