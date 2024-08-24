package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MinDiapasonTest {

    @Test
    void whenFirstMinThen0() {
        int[] data = {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int output = MinDiapason.findMin(data, start, finish);
        int expected = 0;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenLastMinThen1() {
        int[] data = {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int output = MinDiapason.findMin(data, start, finish);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMiddleMinThen2() {
        int[] data = {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int output = MinDiapason.findMin(data, start, finish);
        int expected = 2;
        assertThat(output).isEqualTo(expected);
    }
}