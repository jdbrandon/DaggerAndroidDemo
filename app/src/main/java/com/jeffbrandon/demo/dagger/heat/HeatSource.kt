package com.jeffbrandon.demo.dagger.heat

import com.jeffbrandon.demo.dagger.fuel.Fuel

abstract class HeatSource {
    abstract fun generateHeat(): Int
    abstract fun consumeFuel(fuel: Fuel)
}