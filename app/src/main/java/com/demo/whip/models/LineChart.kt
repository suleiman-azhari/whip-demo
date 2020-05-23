package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class LineChart(
    @SerializedName("chartType")
    val chartType: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("items")
    val lineChartItems: List<LineChartItem>,
    @SerializedName("title")
    val title: String
)