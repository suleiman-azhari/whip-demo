package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("message")
    val message: String
)