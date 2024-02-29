package com.jeferro.katas.tire_pressure

class StubAlarm(
    private var value: Double
) : Alarm() {

    override fun popNextPressurePsiValue() = value
}