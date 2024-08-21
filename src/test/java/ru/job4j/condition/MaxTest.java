package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void when1To2Then2() {
        int output = Max.max(1, 2);
        int expected = 2;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMax3To1Then3() {
        int output = Max.max(3, 1);
        int expected = 3;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMax1To5Then5() {
        int output = Max.max(1, 5);
        int expected = 5;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when2To2Then2() {
        int output = Max.max(2, 2);
        int expected = 2;
        assertThat(output).isEqualTo(expected);
    }
}