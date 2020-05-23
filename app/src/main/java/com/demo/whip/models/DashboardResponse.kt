package com.demo.whip.models


import com.google.gson.annotations.SerializedName

data class DashboardResponse(
    @SerializedName("httpStatus")
    val httpStatus: Int,
    @SerializedName("response")
    val response: Response
)