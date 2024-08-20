package ru.job4j;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP2K2Then2() {
        double expected = 2;
        double output = RectangleArea.square(6, 2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void whenP4k1Then1() {
        double expected = 1;
        double output = RectangleArea.square(4, 1);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    @DisplayName("Что тут?")
    void whenP5K1Then1Dot5625() {
        double expected = 1.5625;
        double output = RectangleArea.square(5, 1);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }
}