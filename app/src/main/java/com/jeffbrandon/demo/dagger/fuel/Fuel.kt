package com.jeffbrandon.demo.dagger.fuel

import timber.log.Timber

abstract class Fuel {

    /**
     * Helper to get fuel type
     * @return the readable name of the fuel type
     */
    abstract fun getType(): String

    /**
     * Consume some fuel
     * @return value > 0 if there was fuel to consume
     */
    open fun consume(): Int {
        Timber.i("Some ${getType()} was consumed")
        return 0
    }
}