package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class HeldItemModel(
    @SerializedName("item")
    val item: ItemModel = ItemModel(),
    @SerializedName("version_details")
    val versionDetails: List<VersionDetailModel> = listOf()
)