package com.jeferro.katas.tire_pressure

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class AlarmTest {

    @Test
    fun foo() {
        val alarm = Alarm()
        assertFalse(alarm.isAlarmOn)
    }
}