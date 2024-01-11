package com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.skin

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class SkinChroma(
    @PrimaryKey
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("displayIcon")
    val chromaDisplayIcon: String?,
    @SerializedName("displayName")
    val chromaDisplayName: String?,
    @SerializedName("fullRender")
    val chromaFullRender: String?,
    @SerializedName("streamedVideo")
    val chromaStreamedVideo: String?,
    @SerializedName("swatch")
    val chromaSwatch: String?
)