package com.jeffbrandon.demo.dagger.activities

import android.os.Bundle
import com.jeffbrandon.demo.dagger.R
import com.jeffbrandon.demo.dagger.Train
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var train: Train

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        train.run()
    }
}
