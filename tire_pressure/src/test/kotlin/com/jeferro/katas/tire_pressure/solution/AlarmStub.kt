package com.jeferro.katas.tire_pressure.solution

class AlarmStub(private val value: Double) : Alarm() {

    override fun popNextPressurePsiValue(): Double {
        return value
    }
}
