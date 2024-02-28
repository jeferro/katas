package com.jeferro.katas.tire_pressure.solution

open class Alarm {

    companion object {
        const val LOW_PRESSURE_THRESHOLD = 17.0
        const val HIGH_PRESSURE_THRESHOLD = 21.0
    }

    private var sensor: Sensor

    @Deprecated("Use constructor with sensor parameter")
    constructor() {
        sensor = RandomSensor()
    }

    constructor(sensor: Sensor) {
        this.sensor = sensor
    }

    private var alarmOn = false

    public fun check() {
        val psiPressureValue = popNextPressurePsiValue()
        if (psiPressureValue < LOW_PRESSURE_THRESHOLD || HIGH_PRESSURE_THRESHOLD < psiPressureValue) {
            alarmOn = true
        }
    }

    protected open fun popNextPressurePsiValue(): Double {
        return sensor.popNextPressurePsiValue()
    }

    fun isAlarmOn(): Boolean {
        return alarmOn
    }
}
