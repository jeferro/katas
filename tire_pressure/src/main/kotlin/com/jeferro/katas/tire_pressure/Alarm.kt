package com.jeferro.katas.tire_pressure

open class Alarm {

    companion object {
        private const val LOW_PRESSURE_THRESHOLD = 17.0
        private const val HIGH_PRESSURE_THRESHOLD = 21.0
    }

    private val sensor: Sensor

    var isAlarmOn = false
        private set

    /**
     * We maintain constructor for backward compatibility
     *
     * @deprecated Use constructor applying inversion dependencies
     */
    constructor() {
        sensor = RandomSensor()
    }

    constructor(sensor: Sensor) {
        this.sensor = sensor
    }

    fun check() {
        val psiPressureValue = popNextPressurePsiValue()

        if (psiPressureValue < LOW_PRESSURE_THRESHOLD || HIGH_PRESSURE_THRESHOLD < psiPressureValue) {
            isAlarmOn = true
        }
    }

    protected open fun popNextPressurePsiValue() = sensor.popNextPressurePsiValue()
}