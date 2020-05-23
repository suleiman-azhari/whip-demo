package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class PieChart(
    @SerializedName("chartType")
    val chartType: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("items")
    val items: List<ChartData>,
    @SerializedName("title")
    val title: String
)