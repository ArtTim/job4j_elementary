package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class EqualLastTest {

    @Test
    void whenCheckEqualThenTrue() {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {6, 5, 3};
        boolean output = EqualLast.check(left, right);
        assertThat(output).isTrue();
    }

    @Test
    void whenCheckNotEqualThenFalse() {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {6, 5, 4};
        boolean output = EqualLast.check(left, right);
        assertThat(output).isFalse();
    }
}