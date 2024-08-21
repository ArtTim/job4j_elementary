package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenManHeightIs180Then92() {
        short height = 180;
        double output = Fit.calculateManWeight(height);
        double expected = 92;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanWeightIs170Then69() {
        short height = 170;
        double expected = 69;
        double output = Fit.calculateWomanWeight(height);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenWomanHeightIs165Then63Dot25() {
        short height = 165;
        double expected = (height - 110) * 1.15;
        double actual = Fit.calculateWomanWeight(height);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenManHeightIs160Then69() {
        short height = 160;
        double expected = (height - 100) * 1.15;
        double actual = Fit.calculateManWeight(height);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenWomanHeightIs150Then46() {
        short height = 150;
        double expected = (height - 110) * 1.15;
        double actual = Fit.calculateWomanWeight(height);
        assertThat(actual).isEqualTo(expected);
    }
}