package com.jeffbrandon.demo.dagger.engine

import com.jeffbrandon.demo.dagger.fuel.Fuel
import com.jeffbrandon.demo.dagger.heat.HeatSource

abstract class Engine constructor(private val heat: HeatSource, private val fuel: Fuel) {

    abstract val powerEfficiency: Int
    fun consumeFuel() {
        heat.consumeFuel(fuel)
    }

    fun generatePower(): Int {
        return heat.generateHeat() * powerEfficiency
    }
}