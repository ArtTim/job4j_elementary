package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5When0() {
        int[] in = {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(in, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getWhenArrayHasNot10WhenMinus1() {
        int[] in = {5, 2, 7};
        int el = 10;
        int result = FindLoop.indexOf(in, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}