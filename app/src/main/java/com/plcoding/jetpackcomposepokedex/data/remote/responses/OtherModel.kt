package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class OtherModel(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorldModel = DreamWorldModel(),
    @SerializedName("home")
    val home: HomeModel = HomeModel(),
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtworkModel = OfficialArtworkModel()
)