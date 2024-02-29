package com.jeferro.katas.tire_pressure

open class Alarm {

    companion object {
        private const val LOW_PRESSURE_THRESHOLD = 17.0
        private const val HIGH_PRESSURE_THRESHOLD = 21.0
    }

    private var sensor = RandomSensor()

    var isAlarmOn = false
        private set

    fun check() {
        val psiPressureValue = popNextPressurePsiValue()

        if (psiPressureValue < LOW_PRESSURE_THRESHOLD || HIGH_PRESSURE_THRESHOLD < psiPressureValue) {
            isAlarmOn = true
        }
    }

    protected open fun popNextPressurePsiValue() = sensor.popNextPressurePsiValue()
}