package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class AbilityModel(
    @SerializedName("ability")
    val ability: AbilityModelX = AbilityModelX(),
    @SerializedName("is_hidden")
    val isHidden: Boolean = false,
    @SerializedName("slot")
    val slot: Int = 0
)