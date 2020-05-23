package com.demo.whip.di.main

import androidx.lifecycle.ViewModel
import com.demo.whip.di.ViewModelKey
import com.demo.whip.ui.main.dashboard.DashboardViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    abstract fun bindDashboardViewModel(dashboardViewModel: DashboardViewModel): ViewModel
}