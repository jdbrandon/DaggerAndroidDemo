package com.jeffbrandon.demo.dagger.heat

abstract class HeatSource {
    abstract fun generateHeat(): Int
    abstract fun consumeFuel()
}