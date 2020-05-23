package com.demo.whip.ui.main.dashboard

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demo.whip.models.DashboardResponse
import com.demo.whip.network.WhipApi
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject


class DashboardViewModel @Inject constructor(whipApi: WhipApi) : ViewModel() {

    private val disposables = CompositeDisposable()
    private val mutableDashboardResponse = MutableLiveData<DashboardResponse>()

    val dashboard: LiveData<DashboardResponse>
        get() = mutableDashboardResponse

    init {
        disposables.add(
            whipApi.getDashboard("LAST_7_DAYS")
                .toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(
                    { value -> mutableDashboardResponse.postValue(value) },
                    { error -> Log.d("MainActivityViewModel", "Received: $error") }
                )
        )
    }

    // Need to dispose of the Observable to prevent a memory leak
    // as we are NOT using LiveData which is lifecycle aware.
    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }
}
