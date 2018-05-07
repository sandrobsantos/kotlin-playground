package com.example.basic

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpressionsTest {

    @Test
    fun `Num should evaluate to value`() {
        assertThat(eval(Num(2))).isEqualTo(2)
    }

    @Test
    fun `Sum should evaluate to sum of left and right`() {
        assertThat(eval(Sum(Num(2), Num(3)))).isEqualTo(5)
    }
}