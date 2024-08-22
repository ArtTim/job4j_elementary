package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0To5Then15() {
        int output = Counter.sum(0, 5);
        int expected = 15;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when8To5Then0() {
        int output = Counter.sum(8, 5);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when1To1Then1() {
        int output = Counter.sum(1, 1);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }
}