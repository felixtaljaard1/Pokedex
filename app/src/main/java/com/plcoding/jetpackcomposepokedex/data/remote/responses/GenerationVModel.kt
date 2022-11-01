package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationVModel(
    @SerializedName("black-white")
    val blackWhite: BlackWhiteModel = BlackWhiteModel()
)