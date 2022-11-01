package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationViModel(
    @SerializedName("omegaruby-alphasapphire")
    val omegarubyAlphasapphire: OmegarubyAlphasapphireModel = OmegarubyAlphasapphireModel(),
    @SerializedName("x-y")
    val xY: XYModel = XYModel()
)