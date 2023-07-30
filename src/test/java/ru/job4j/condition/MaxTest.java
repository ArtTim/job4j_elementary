package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenFirst5Second10Then10() {
        int result = Max.max(5, 10);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst15Second3Then15() {
        int result = Max.max(15, 3);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst10Second10Then10() {
        int result = Max.max(10, 10);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}