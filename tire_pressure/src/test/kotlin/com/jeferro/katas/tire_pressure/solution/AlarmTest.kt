package com.jeferro.katas.tire_pressure.solution

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.whenever

@ExtendWith(MockitoExtension::class)
class AlarmTest {

    @Mock
    private lateinit var sensor: Sensor

    @InjectMocks
    private lateinit var alarm: Alarm

    @Test
    fun `should alarm when pressure is less than 16 (below the range)`() {
        whenever(sensor.popNextPressurePsiValue())
            .thenReturn(16.0)

        alarm.check()

        assertTrue(alarm.isAlarmOn())
    }

    @Test
    fun `should alarm when pressure is less than 16 (below the range -- stub)`() {
        val alarm = AlarmStub(16.0)

        alarm.check()

        assertTrue(alarm.isAlarmOn())
    }

    @Test
    fun `should alarm when value is greater than 22 (above the range)`() {
        whenever(sensor.popNextPressurePsiValue())
            .thenReturn(22.0)

        alarm.check()

        assertTrue(alarm.isAlarmOn())
    }

    @Test
    fun `should alarm when value is greater than 22 (above the range -- stub)`() {
        val alarm = AlarmStub(22.0)

        alarm.check()

        assertTrue(alarm.isAlarmOn())
    }

    @Test
    fun `should not alarm when pressure is 18 (inside range)`() {
        whenever(sensor.popNextPressurePsiValue())
            .thenReturn(18.0)

        alarm.check()

        assertFalse(alarm.isAlarmOn())
    }

    @Test
    fun `should not alarm when pressure is 18 (inside range -- stub)`() {
        val alarm = AlarmStub(18.0)

        alarm.check()

        assertFalse(alarm.isAlarmOn())
    }
}