package com.wbertan.spikenavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_common.*

abstract class BaseFragment : Fragment() {

    abstract val fragmentTitle: String

    open val labelButtonA: String? = null
    open val labelButtonB: String? = null

    open fun actionButtonA() = Unit
    open fun actionButtonB() = Unit

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_common, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title.text = fragmentTitle
        buttonA.apply {
            text = labelButtonA
            setOnClickListener { actionButtonA() }
            visibility = labelButtonA?.let { View.VISIBLE } ?: View.INVISIBLE
        }
        buttonB.apply {
            text = labelButtonB
            setOnClickListener { actionButtonB() }
            visibility = labelButtonB?.let { View.VISIBLE } ?: View.INVISIBLE
        }
    }

    override fun onResume() {
        super.onResume()

        if (TokenHolder.tokenExpired) {
            findNavController().navigate(R.id.action_to_login)
        }
    }
}