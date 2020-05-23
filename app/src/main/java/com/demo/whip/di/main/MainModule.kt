package com.demo.whip.di.main

import com.demo.whip.network.WhipApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
object MainModule {

    @JvmStatic
    @Provides
    fun provideWhipApi(retrofit: Retrofit): WhipApi {
        return retrofit.create(WhipApi::class.java)
    }
}