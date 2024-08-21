package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;
class PointTest {

    @Test
    void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when10to02Then2Dot23606797749979() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 2;
        double expected = 2.23606797749979;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when03to61Then6Dot324555320336759() {
        int x1 = 0;
        int y1 = 3;
        int x2 = 6;
        int y2 = 1;
        double expected = 6.324555320336759;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when33to12Then2Dot23606797749979() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 1;
        int y2 = 2;
        double expected = 2.23606797749979;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }
}