package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenNumer5Then120() {
        int number = 5;
        int output = Factorial.calculate(number);
        int expected = 120;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenNumer0Then1() {
        int number = 0;
        int output = Factorial.calculate(number);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenNumber1Then1() {
        int number = 1;
        int output = Factorial.calculate(number);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }
}