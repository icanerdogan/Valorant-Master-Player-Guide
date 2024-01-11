package com.ibrahimcanerdogan.masterplayerguide.data.model.map

import androidx.room.PrimaryKey

data class MapCallout(
    @PrimaryKey(autoGenerate = true)
    var calloutId : Int,
    val location: MapLocation,
    val regionName: String,
    val superRegionName: String
)