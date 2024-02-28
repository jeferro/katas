package com.jeferro.katas.tire_pressure.problem

import java.util.*

// The reading of the pressure value from the sensor is simulated in this implementation.
// Because the focus of the exercise is on the other class.
class Sensor {
    companion object {
        const val OFFSET = 16.0

        private fun randomPressure(): Double {
            // placeholder implementation that simulate a real sensor in a real tire
            val basicRandomNumbersGenerator = Random()
            return 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble()
        }
    }

    fun popNextPressurePsiValue(): Double {
        return OFFSET + randomPressure()
    }
}
