package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class Service(
    @SerializedName("description")
    val description: String,
    @SerializedName("items")
    val serviceItems: List<ServiceItem>,
    @SerializedName("title")
    val title: String
)