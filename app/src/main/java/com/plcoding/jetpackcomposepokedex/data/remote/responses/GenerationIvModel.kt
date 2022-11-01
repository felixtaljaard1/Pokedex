package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationIvModel(
    @SerializedName("diamond-pearl")
    val diamondPearl: DiamondPearlModel = DiamondPearlModel(),
    @SerializedName("heartgold-soulsilver")
    val heartgoldSoulsilver: HeartgoldSoulsilverModel = HeartgoldSoulsilverModel(),
    @SerializedName("platinum")
    val platinum: PlatinumModel = PlatinumModel()
)