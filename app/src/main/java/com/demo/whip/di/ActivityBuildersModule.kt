package com.demo.whip.di

import com.demo.whip.di.main.MainFragmentBuildersModule
import com.demo.whip.di.main.MainModule
import com.demo.whip.di.main.MainViewModelsModule
import com.demo.whip.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    /**
    dagger will take care of creating "MainActivitySubcomponent",
    because we are using @ContributesAndroidInjector,
    it can be found in generated file "ActivityBuildersModule_ContributeMainActivity"
     **/
    @ContributesAndroidInjector(
        modules = [
            MainViewModelsModule::class,
            MainModule::class,
            MainFragmentBuildersModule::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity
}