package com.jeferro.katas

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