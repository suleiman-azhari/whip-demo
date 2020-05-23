package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class Job(
    @SerializedName("description")
    val description: String,
    @SerializedName("items")
    val jobItems: List<JobItem>,
    @SerializedName("title")
    val title: String
)