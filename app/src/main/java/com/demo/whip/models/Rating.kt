package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("avg")
    val avg: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("items")
    val stars: Stars,
    @SerializedName("title")
    val title: String
)