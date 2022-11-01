package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationIiiModel(
    @SerializedName("emerald")
    val emerald: EmeraldModel = EmeraldModel(),
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreenModel = FireredLeafgreenModel(),
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphireModel = RubySapphireModel()
)