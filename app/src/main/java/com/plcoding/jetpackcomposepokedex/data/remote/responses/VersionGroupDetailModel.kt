package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class VersionGroupDetailModel(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int = 0,
    @SerializedName("move_learn_method")
    val moveLearnMethod: MoveLearnMethodModel = MoveLearnMethodModel(),
    @SerializedName("version_group")
    val versionGroup: VersionGroupModel = VersionGroupModel()
)