package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {

    @Test
    void whenBound3Then014() {
        int input = 3;
        int[] output = Square.calculate(input);
        int[] expected = new int[] {0, 1, 4};
        assertThat(output).containsExactly(expected);
    }

    @Test
    void whenBound5Then014916() {
        int input = 5;
        int[] output = Square.calculate(input);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(output).containsExactly(expected);
    }
}