package com.plcoding.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class PokemonModel(
    @SerializedName("abilities")
    val abilities: List<AbilityModel> = listOf(),
    @SerializedName("base_experience")
    val baseExperience: Int = 0,
    @SerializedName("forms")
    val forms: List<FormModel> = listOf(),
    @SerializedName("game_indices")
    val gameIndices: List<GameIndiceModel> = listOf(),
    @SerializedName("height")
    val height: Int = 0,
    @SerializedName("held_items")
    val heldItems: List<HeldItemModel> = listOf(),
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("is_default")
    val isDefault: Boolean = false,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String = "",
    @SerializedName("moves")
    val moves: List<MoveModel> = listOf(),
    @SerializedName("name")
    val name: String = "",
    @SerializedName("order")
    val order: Int = 0,
    @SerializedName("past_types")
    val pastTypes: List<Any> = listOf(),
    @SerializedName("species")
    val species: SpeciesModel = SpeciesModel(),
    @SerializedName("sprites")
    val sprites: SpritesModel = SpritesModel(),
    @SerializedName("stats")
    val stats: List<StatModel> = listOf(),
    @SerializedName("types")
    val types: List<TypeModel> = listOf(),
    @SerializedName("weight")
    val weight: Int = 0
)