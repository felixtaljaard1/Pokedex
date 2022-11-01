package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class HomeModel(
    @SerializedName("front_default")
    val frontDefault: String = "",
   // @SerializedName("front_female")
   // val frontFemale: AnyModel = AnyModel(),
    @SerializedName("front_shiny")
    val frontShiny: String = "",
   // @SerializedName("front_shiny_female")
   // val frontShinyFemale: AnyModel = AnyModel()
)