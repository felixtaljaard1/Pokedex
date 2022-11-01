package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationIModel(
    @SerializedName("red-blue")
    val redBlue: RedBlueModel = RedBlueModel(),
    @SerializedName("yellow")
    val yellow: YellowModel = YellowModel()
)