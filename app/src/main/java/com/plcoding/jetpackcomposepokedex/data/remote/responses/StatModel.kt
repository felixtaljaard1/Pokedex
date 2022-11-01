package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class StatModel(
    @SerializedName("base_stat")
    val baseStat: Int = 0,
    @SerializedName("effort")
    val effort: Int = 0,
    @SerializedName("stat")
    val stat: StatModelX = StatModelX()
)