package com.jeffbrandon.demo.dagger.fuel

import javax.inject.Inject
import kotlin.math.max

class Wood @Inject constructor() : Fuel() {
    private var logs = 1
    override fun getType() = "Wood"
    override fun consume(): Int {
        super.consume()
        return max(logs--, 0)
    }
}