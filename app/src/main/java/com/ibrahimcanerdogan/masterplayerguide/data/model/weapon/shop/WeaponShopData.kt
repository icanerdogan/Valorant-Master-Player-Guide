package com.ibrahimcanerdogan.masterplayerguide.data.model.weapon.shop

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class WeaponShopData(
    @PrimaryKey(autoGenerate = true)
    val shopId: Int,
    @SerializedName("canBeTrashed")
    val shopCanBeTrashed: Boolean?,
    @SerializedName("category")
    val shopCategory: String?,
    @SerializedName("categoryText")
    val shopCategoryText: String?,
    @SerializedName("cost")
    val shopCost: Int?,
    @SerializedName("image")
    val shopImage: String?,
    @SerializedName("newImage")
    val shopNewImage: String?,
    @SerializedName("newImage2")
    val shopNewImage2: String?,
    @SerializedName("shopOrderPriority")
    val shopOrderPriority: Int?
)