package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class PokemonListModel(
    @SerializedName("count")
    val count: Int = 0,
    @SerializedName("next")
    val next: String = "",
 //   @SerializedName("previous")
 //   val previous: AnyModel = AnyModel(),
    @SerializedName("results")
    val results: List<ResultModel> = listOf()
)