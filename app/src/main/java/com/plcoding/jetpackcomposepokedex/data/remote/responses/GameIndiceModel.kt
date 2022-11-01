package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GameIndiceModel(
    @SerializedName("game_index")
    val gameIndex: Int = 0,
    @SerializedName("version")
    val version: VersionModel = VersionModel()
)