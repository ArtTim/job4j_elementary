package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0To5Then15() {
        int start = 0;
        int finish = 5;
        int output = Counter.sum(start, finish);
        int expected = 15;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when8To5Then0() {
        int start = 8;
        int finish = 5;
        int output = Counter.sum(start, finish);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when1To1Then1() {
        int start = 1;
        int finish = 1;
        int output = Counter.sum(start, finish);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenByNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenNumbersFromMinus5To5Then0() {
        int start = -5;
        int finish = 5;
        int output = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }
}