package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] output = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(output).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] output = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(output).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6};
        int[] output = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(output).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLength3() {
        int[] input = new int[] {1, 2, 3};
        int[] output = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(output).containsExactly(expected);
    }

    @Test
    void whenSwap0To2() {
        int[] input = new int[] {5, 3, 1, 10, 7};
        int source = 0;
        int destination = 3;
        int[] output = SwitchArray.swap(input, source, destination);
        int[] expected = {10, 3, 1, 5, 7};
        assertThat(output).containsExactly(expected);
    }

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }
}