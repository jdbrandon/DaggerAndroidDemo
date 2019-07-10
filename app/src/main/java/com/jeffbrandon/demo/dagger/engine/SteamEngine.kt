package com.jeffbrandon.demo.dagger.engine

import com.jeffbrandon.demo.dagger.fuel.Fuel
import com.jeffbrandon.demo.dagger.heat.HeatSource
import javax.inject.Inject

class SteamEngine @Inject constructor(heat: HeatSource, fuel: Fuel) : Engine(heat, fuel) {
    override val powerEfficiency: Int
        get() = 2
}