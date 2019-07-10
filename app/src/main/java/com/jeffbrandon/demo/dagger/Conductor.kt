package com.jeffbrandon.demo.dagger

import com.jeffbrandon.demo.dagger.engine.Engine
import javax.inject.Inject

class Conductor @Inject constructor(water: Water) {
    init {
        drinkWater(water)
    }

    @Throws(ExceptionInInitializerError::class)
    private fun drinkWater(water: Water) {
        if (!water.isEmpty()) {
            water.consume()
        } else {
            throw ExceptionInInitializerError("Conductor needs water to complete his drive!")
        }
    }

    fun drive(engine: Engine): Int {
        engine.consumeFuel()
        return engine.generatePower()
    }
}