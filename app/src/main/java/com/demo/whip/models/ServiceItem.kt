package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class ServiceItem(
    @SerializedName("avg")
    val avg: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("growth")
    val growth: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("total")
    val total: Int
)