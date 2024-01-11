package com.ibrahimcanerdogan.masterplayerguide.data.model.map

import androidx.room.PrimaryKey

data class MapLocation(
    @PrimaryKey(autoGenerate = true)
    val locationId : Int,
    val x: Double,
    val y: Double
)