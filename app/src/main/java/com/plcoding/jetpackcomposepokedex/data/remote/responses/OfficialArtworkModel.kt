package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class OfficialArtworkModel(
    @SerializedName("front_default")
    val frontDefault: String = ""
)