package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class HeartgoldSoulsilverModel(
    @SerializedName("back_default")
    val backDefault: String = "",
    @SerializedName("back_female")
    val backFemale: AnyModel = AnyModel(),
    @SerializedName("back_shiny")
    val backShiny: String = "",
    @SerializedName("back_shiny_female")
    val backShinyFemale: AnyModel = AnyModel(),
    @SerializedName("front_default")
    val frontDefault: String = "",
    @SerializedName("front_female")
    val frontFemale: AnyModel = AnyModel(),
    @SerializedName("front_shiny")
    val frontShiny: String = "",
    @SerializedName("front_shiny_female")
    val frontShinyFemale: AnyModel = AnyModel()
)