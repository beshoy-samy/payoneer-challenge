package com.paynoneer.challenge

import android.os.Bundle
import com.paynoneer.challenge.databinding.ActivityMainBinding
import com.paynoneer.core.base.activity.ActivityViewBinder
import com.paynoneer.core.base.activity.BaseActivity
import com.paynoneer.core.base.activity.BaseEmptyActivity
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