package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MinTest {

    @Test
    void when2573Then2() {
        int[] in = {2, 5, 7, 3};
        int result = Min.findMin(in);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when615357Then6() {
        int[] in = {6, 15, 35, 7};
        int result = Min.findMin(in);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}