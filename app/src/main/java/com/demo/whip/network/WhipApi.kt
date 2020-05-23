package com.demo.whip.network

import com.demo.whip.models.DashboardResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WhipApi {

    @GET("analytic/dashboard/operation/mock")
    fun getDashboard(@Query("scope") scope: String): Single<DashboardResponse>
}