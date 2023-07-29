package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class SquareAreaTest {

    @Test
    void whenP8K2Then3Dot55() {
        double expected = 3.55;
        double result = SquareArea.area(8, 2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP6K4Then1Dot44() {
        double expected = 1.44;
        double result = SquareArea.area(6, 4);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K3Then3() {
        double expected = 3.0;
        double result = SquareArea.area(8, 3);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}