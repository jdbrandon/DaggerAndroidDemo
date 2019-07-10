package com.jeffbrandon.demo.dagger.heat

import com.jeffbrandon.demo.dagger.fuel.Fuel
import timber.log.Timber
import javax.inject.Inject

class Fire @Inject constructor() : HeatSource() {
    private var hasFuel = false
    override fun generateHeat(): Int {
        val ret = if (hasFuel) 5 else 0
        hasFuel = false
        return ret
    }

    override fun consumeFuel(fuel: Fuel) {
        if (fuel.getType() == "Wood" || fuel.getType() == "Coal")
            hasFuel = fuel.consume() > 0
        else Timber.i("Fire cant burn ${fuel.getType()}")
    }
}