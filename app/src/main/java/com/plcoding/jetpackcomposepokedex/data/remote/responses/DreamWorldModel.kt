package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class DreamWorldModel(
    @SerializedName("front_default")
    val frontDefault: String = "",
   // @SerializedName("front_female")
 //   val frontFemale: AnyModel = AnyModel()
)