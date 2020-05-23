package com.demo.whip.ui.main.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.demo.whip.R
import com.demo.whip.models.JobItem

class JobsAdapter(private val jobs: List<JobItem>) :
    RecyclerView.Adapter<JobsAdapter.JobsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobsHolder {
        val inflater = LayoutInflater.from(parent.context)
        return JobsHolder(inflater, parent)
    }

    override fun getItemCount(): Int = jobs.size

    override fun onBindViewHolder(holder: JobsHolder, position: Int) {
        val jobItem: JobItem = jobs[position]
        holder.bind(jobItem)
    }

    class JobsHolder(inflater: LayoutInflater, parent: ViewGroup) :
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_job, parent, false)) {
        private var titleView: TextView? = null
        private var descriptionView: TextView? = null
        private var growthView: TextView? = null


        init {
            titleView = itemView.findViewById(R.id.tv_job_item_title)
            descriptionView = itemView.findViewById(R.id.tv_job_item_description)
            growthView = itemView.findViewById(R.id.tv_growth)

        }

        fun bind(job: JobItem) {
            titleView?.text = job.title
            descriptionView?.text = job.description
            growthView?.text = job.growth.toString()
        }

    }

}