package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class VersionsModel(
    @SerializedName("generation-i")
    val generationI: GenerationIModel = GenerationIModel(),
    @SerializedName("generation-ii")
    val generationIi: GenerationIiModel = GenerationIiModel(),
    @SerializedName("generation-iii")
    val generationIii: GenerationIiiModel = GenerationIiiModel(),
    @SerializedName("generation-iv")
    val generationIv: GenerationIvModel = GenerationIvModel(),
    @SerializedName("generation-v")
    val generationV: GenerationVModel = GenerationVModel(),
    @SerializedName("generation-vi")
    val generationVi: GenerationViModel = GenerationViModel(),
    @SerializedName("generation-vii")
    val generationVii: GenerationViiModel = GenerationViiModel(),
    @SerializedName("generation-viii")
    val generationViii: GenerationViiiModel = GenerationViiiModel()
)