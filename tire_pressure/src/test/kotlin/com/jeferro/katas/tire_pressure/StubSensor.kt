package com.jeferro.katas.tire_pressure

class StubSensor(
    private var value: Double
) : Sensor {

    override fun popNextPressurePsiValue() = value
}