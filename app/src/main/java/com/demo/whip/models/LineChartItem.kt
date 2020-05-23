package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class LineChartItem(
    @SerializedName("key")
    val key: String,
    @SerializedName("value")
    val value: List<Value>
)