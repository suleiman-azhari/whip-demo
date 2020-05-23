package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class ChartData(
    @SerializedName("key")
    val name: String,
    @SerializedName("value")
    val percent: Double
)