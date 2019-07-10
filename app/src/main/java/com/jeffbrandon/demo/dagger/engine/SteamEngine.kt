package com.jeffbrandon.demo.dagger.engine

import com.jeffbrandon.demo.dagger.heat.HeatSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SteamEngine @Inject constructor(heat: HeatSource) : Engine(heat) {
    override val powerEfficiency: Int
        get() = 2
}