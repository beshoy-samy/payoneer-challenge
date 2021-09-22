package com.payoneer.challenge

import android.os.Bundle
import com.payoneer.challenge.databinding.ActivityMainBinding
import com.payoneer.core.base.activity.ActivityViewBinder
import com.payoneer.core.base.activity.BaseEmptyActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseEmptyActivity<ActivityMainBinding>() {

    override fun getViewBinder(): ActivityViewBinder<ActivityMainBinding> {
        return ActivityViewBinder { ActivityMainBinding.inflate(it) }
    }

    override fun onBindFinished(savedInstanceState: Bundle?) {
        //left to be used later if needed
    }

}