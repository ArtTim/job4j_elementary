package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RollBackArrayTest {

    @Test
    void whenRollbackArrayIsEmpty() {
        int[] input = new int[] {};
        int[] output = RollBackArray.rollback(input);
        int[] expected = new int[] {};
        assertThat(output).containsExactly(expected);
    }

    @Test
    void whenRollabackArrayHaveOne() {
        int[] input = new int[] {1};
        int[] output = RollBackArray.rollback(input);
        int[] expected = new int[] {1};
        assertThat(output).containsExactly(expected);
    }

    @Test
    void whenRollbackArrayFull() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] output = RollBackArray.rollback(input);
        int[] expected = new int[] {4, 3, 2, 1};
        assertThat(output).containsExactly(expected);
    }

    @Test
    void whenRollbackArraySame() {
        int[] input = new int[] {1, 1, 1, 1};
        int[] output = RollBackArray.rollback(input);
        int[] expected = new int[] {1, 1, 1, 1};
        assertThat(output).containsExactly(expected);
    }
}