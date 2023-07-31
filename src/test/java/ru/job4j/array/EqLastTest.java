package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class EqLastTest {

    @Test
    void whenEq() {
        int[] first = {1, 2, 3};
        int[] second = {4, 3, 3};
        boolean result = EqLast.check(first, second);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEq() {
        int[] first = {1, 2, 3};
        int[] second = {3, 2, 1};
        boolean result = EqLast.check(first, second);
        assertThat(result).isFalse();
    }
}