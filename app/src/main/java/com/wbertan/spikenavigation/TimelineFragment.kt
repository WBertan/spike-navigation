package com.wbertan.spikenavigation

import android.net.Uri
import androidx.navigation.fragment.findNavController

class TimelineFragment : BaseFragment() {

    override val fragmentTitle: String = "Timeline"

    override val labelButtonA: String = "Report Overview"
    override val labelButtonB: String = "Deeplink Report Detail"

    override fun actionButtonA() {
        findNavController().navigate(R.id.action_timeline_to_navigationReport)
    }

    override fun actionButtonB() {
        findNavController().navigate(Uri.parse("spike://reportDetail"))
    }

}