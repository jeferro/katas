package com.jeferro.katas.tire_pressure

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class AlarmTest {

    @Test
    fun `should alarm when pressure is less than 16 (below the range)`() {
        val stubAlarm = StubAlarm(16.0)

        stubAlarm.check()

        assertTrue(stubAlarm.isAlarmOn)
    }

    @Test
    fun `should alarm when value is greater than 22 (above the range)`() {
        val stubAlarm = StubAlarm(22.0)

        stubAlarm.check()

        assertTrue(stubAlarm.isAlarmOn)
    }

    @Test
    fun `should not alarm when pressure is 18 (inside range)`() {
        val stubAlarm = StubAlarm(18.0)

        stubAlarm.check()

        assertFalse(stubAlarm.isAlarmOn)
    }
}