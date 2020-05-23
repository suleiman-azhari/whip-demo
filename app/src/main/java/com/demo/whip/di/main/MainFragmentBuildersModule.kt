package com.demo.whip.di.main

import com.demo.whip.ui.main.dashboard.DashboardFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentBuildersModule {

    /**
    dagger will take care of creating "DashboardFragmentSubcomponent",
    because we are using @ContributesAndroidInjector,
    it can be found in generated file "MainFragmentBuildersModule_ContributeDashboardFragment"
     **/
    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): DashboardFragment
}