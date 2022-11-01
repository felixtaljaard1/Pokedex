package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationIiModel(
    @SerializedName("crystal")
    val crystal: CrystalModel = CrystalModel(),
    @SerializedName("gold")
    val gold: GoldModel = GoldModel(),
    @SerializedName("silver")
    val silver: SilverModel = SilverModel()
)