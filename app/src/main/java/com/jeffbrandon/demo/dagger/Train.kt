package com.jeffbrandon.demo.dagger

import timber.log.Timber
import javax.inject.Inject

class Train @Inject constructor(
    private val conductor: Conductor,
    private val rails: Rails
) {

    fun run() {
        Timber.i(rails.type)
        Timber.i(rails.destination)
        Timber.i("${rails.distance}")
        var remaining = rails.distance
        while (remaining > 0) {
            val step = conductor.drive()
            if (step > 0)
                remaining -= step
            else {
                Timber.i("ran out of fuel")
                break
            }
        }
        if (remaining < 1)
            Timber.i("$conductor made it to ${rails.destination}")
    }
}