package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationViiModel(
    @SerializedName("icons")
    val icons: IconsModel = IconsModel(),
    @SerializedName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoonModel = UltraSunUltraMoonModel()
)