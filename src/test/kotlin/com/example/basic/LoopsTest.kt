package com.example.basic

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LoopsTest {

    @Test
    fun `should generate fizz buzz`() {
        assertThat(genFizzBuzz(5)).containsExactly(
          "1", "2", "Fizz", "4", "Buzz"
        )
    }

    @Test
    fun `should generate fizz buzz in reverse order stepping by 2`() {
        assertThat(genReverseFizzBuzzStepping2(15)).containsExactly(
                "FizzBuzz", "13", "11", "Fizz", "7", "Buzz", "Fizz", "1"
        )
    }
}