package com.jeffbrandon.demo.dagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Rails @Inject constructor() {
    val type = "iron"
    val destination = "home"
    val distance = 100
}