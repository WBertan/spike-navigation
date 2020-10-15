package com.wbertan.spikenavigation

import androidx.navigation.fragment.findNavController

class DashboardFragment : BaseFragment() {

    override val fragmentTitle: String = "Dashboard"

    override val labelButtonA: String = "Report Overview"
    override val labelButtonB: String = "Timeline"

    override fun actionButtonA() {
        findNavController().navigate(R.id.action_dashboard_to_navigationReport)
    }

    override fun actionButtonB() {
        findNavController().navigate(R.id.action_dashboard_to_timeline)
    }

}