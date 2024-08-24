package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] input = new int[] {5, 7, 6};
        int element = 5;
        int output = FindLoop.indexOf(input, element);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] input = new int[] {1, 2, 3, 4};
        int element = 10;
        int output = FindLoop.indexOf(input, element);
        int expected = -1;
        assertThat(output).isEqualTo(expected);
    }
}