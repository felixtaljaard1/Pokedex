package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class TypeModel(
    @SerializedName("slot")
    val slot: Int = 0,
    @SerializedName("type")
    val type: TypeModelX = TypeModelX()
)