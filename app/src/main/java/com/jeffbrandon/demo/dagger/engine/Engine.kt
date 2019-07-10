package com.jeffbrandon.demo.dagger.engine

import com.jeffbrandon.demo.dagger.heat.HeatSource

abstract class Engine constructor(private val heat: HeatSource) {

    abstract val powerEfficiency: Int
    fun consumeFuel() {
        heat.consumeFuel()
    }

    fun generatePower(): Int {
        return heat.generateHeat() * powerEfficiency
    }
}