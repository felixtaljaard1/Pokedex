package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class VersionDetailModel(
    @SerializedName("rarity")
    val rarity: Int = 0,
    @SerializedName("version")
    val version: VersionModel = VersionModel()
)