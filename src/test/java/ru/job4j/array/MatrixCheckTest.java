package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    void whenHasNotMonoHorizontalThenFalse() {
        char[][] input = {
                {' ', ' ', 'X'},
                {'X', 'X', ' '},
                {' ', ' ', ' '},
        };
        int row = 0;
        boolean output = MatrixCheck.monoHorizontal(input, row);
        assertThat(output).isFalse();
    }
}