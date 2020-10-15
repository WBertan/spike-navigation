package com.wbertan.spikenavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

object TokenHolder {

    var tokenExpired: Boolean = true
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valid.setOnClickListener { TokenHolder.tokenExpired = false }
        expire.setOnClickListener { TokenHolder.tokenExpired = true }
    }
}