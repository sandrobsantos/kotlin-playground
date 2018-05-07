package com.example.basic

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RectangleTest {

    @Test
    fun `should be a square`() {
        assertThat(Rectangle(4, 4).isSquare).isTrue()
    }
}