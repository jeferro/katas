package com.jeferro.katas.tire_pressure

/**
 * @deprecated We can remove this class after removing default constructor of class Alarm
 */
class StubAlarm(
    private var value: Double
) : Alarm() {

    override fun popNextPressurePsiValue() = value
}