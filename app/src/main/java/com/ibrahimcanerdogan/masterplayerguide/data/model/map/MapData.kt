package com.ibrahimcanerdogan.masterplayerguide.data.model.map

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "map_data"
)
data class MapData(
    @PrimaryKey
    val uuid: String,
    val callouts: List<MapCallout>?,
    val coordinates: String?,
    val displayIcon: String?,
    val displayName: String,
    val listViewIcon: String,
    val mapUrl: String,
    val narrativeDescription: String?,
    val splash: String,
    val tacticalDescription: String?,
)