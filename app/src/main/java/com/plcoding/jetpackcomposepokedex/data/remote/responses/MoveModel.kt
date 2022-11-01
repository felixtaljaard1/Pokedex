package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class MoveModel(
    @SerializedName("move")
    val move: MoveModelX = MoveModelX(),
    @SerializedName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetailModel> = listOf()
)