package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short height = 180;
        double expected = 92;
        double result = Fit.manWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short height = 170;
        double expected = 69;
        double result = Fit.womanWeight(height);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}