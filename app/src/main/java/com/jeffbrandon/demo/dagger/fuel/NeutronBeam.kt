package com.jeffbrandon.demo.dagger.fuel

import javax.inject.Inject

class NeutronBeam @Inject constructor() : Fuel() {
    override fun getType() = "Neutron Beam"

    override fun consume(): Int {
        super.consume()
        return 1
    }
}