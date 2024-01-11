package com.ibrahimcanerdogan.masterplayerguide.data.model.weapon

import com.google.gson.annotations.SerializedName

data class Weapon(
    @SerializedName("data")
    val weapons: List<WeaponData>,
    @SerializedName("status")
    val status: Int
)