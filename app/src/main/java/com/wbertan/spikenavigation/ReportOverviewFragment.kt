package com.wbertan.spikenavigation

import androidx.navigation.fragment.findNavController

class ReportOverviewFragment : BaseFragment() {

    override val fragmentTitle: String = "Report Overview"

    override val labelButtonA: String = "Report Detail"
    override val labelButtonB: String = "Timeline"

    override fun actionButtonA() {
        findNavController().navigate(R.id.action_reportOverview_to_reportDetail)
    }

    override fun actionButtonB() {
        findNavController().navigate(R.id.action_reportOverview_to_timeline)
    }

}