package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short height = 180;
        double output = Fit.manWeight(height);
        double expected = 92;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short height = 170;
        double expected = 69;
        double output = Fit.womanWeight(height);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}