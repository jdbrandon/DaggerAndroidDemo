package com.jeffbrandon.demo.dagger.fuel

import javax.inject.Inject
import kotlin.math.max

class Coal @Inject constructor() : Fuel() {
    private var bricks = 100
    override fun getType() = "Coal"
    override fun consume(): Int {
        super.consume()
        return max(bricks--, 0)
    }
}