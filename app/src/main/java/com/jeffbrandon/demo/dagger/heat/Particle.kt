package com.jeffbrandon.demo.dagger.heat

import com.jeffbrandon.demo.dagger.fuel.Fuel
import timber.log.Timber
import javax.inject.Inject

class Particle @Inject constructor() : HeatSource() {
    override fun generateHeat(): Int {
        return 1
    }

    override fun consumeFuel(fuel: Fuel) {
        if (fuel.getType() != "Neutron Beam") {
            Timber.w("Particle heat can't use ${fuel.getType()}")
        }
        fuel.consume()
    }
}