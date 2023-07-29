package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then() {
        double expected = 2;
        double result = Point.distance(0, 0, 2, 0);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10To20Then() {
        double expected = 1;
        double result = Point.distance(1, 0, 2, 0);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20To20Then() {
        double expected = 0;
        double result = Point.distance(2, 0, 2, 0);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20To30Then() {
        double expected = 1;
        double result = Point.distance(2, 0, 3, 0);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}