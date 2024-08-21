package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TriangleTest {

    @Test
    void whenExist() {
        boolean result = Triangle.exist(2, 2, 2);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotExist() {
        boolean result = Triangle.exist(1, 1, 2);
        assertThat(result).isFalse();
    }
}