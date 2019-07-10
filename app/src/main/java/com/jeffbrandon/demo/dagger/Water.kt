package com.jeffbrandon.demo.dagger

import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Water @Inject constructor() {
    private var level = 10
    fun consume() {
        level--
        Timber.i("water consumed $level left")
        if (level == 0)
            Timber.w("We're out of water!")
    }

    fun isEmpty(): Boolean = level < 1
}