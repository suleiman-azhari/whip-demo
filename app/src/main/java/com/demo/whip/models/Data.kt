package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("analytics")
    val analytics: Analytics
)