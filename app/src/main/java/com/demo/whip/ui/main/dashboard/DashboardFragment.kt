package com.demo.whip.ui.main.dashboard

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import com.demo.whip.R
import com.demo.whip.models.Stars
import com.demo.whip.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_dashboard.*
import javax.inject.Inject

class DashboardFragment : DaggerFragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory

    companion object {

        fun newInstance(): DashboardFragment {
            return DashboardFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dashboardViewModel =
            ViewModelProvider(this, viewModelProviderFactory)
                .get(DashboardViewModel::class.java)

        jobs_rv.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )

        dashboardViewModel.dashboard
            .observe(viewLifecycleOwner, Observer {
                tv_rating_title.text = it.response.data.analytics.rating.title
                tv_rating_description.text = it.response.data.analytics.rating.description
                tv_average_rating.text = it.response.data.analytics.rating.avg.toString()
                tv_total_rating.text =
                    totalRatings(it.response.data.analytics.rating.stars).toString() + " Ratings"

                tv_jobs_title.text = it.response.data.analytics.job.title
                tv_jobs_description.text = it.response.data.analytics.job.description
                jobs_rv.apply { adapter = JobsAdapter(it.response.data.analytics.job.jobItems) }


            })
    }

    private fun totalRatings(starts: Stars): Int {
        return starts.oneStar +
                starts.twoStars +
                starts.threeStars +
                starts.fourStars +
                starts.fiveStars
    }
}