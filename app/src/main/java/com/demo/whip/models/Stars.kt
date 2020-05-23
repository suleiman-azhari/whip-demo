package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class Stars(
    @SerializedName("1")
    val oneStar: Int,
    @SerializedName("2")
    val twoStars: Int,
    @SerializedName("3")
    val threeStars: Int,
    @SerializedName("4")
    val fourStars: Int,
    @SerializedName("5")
    val fiveStars: Int
)