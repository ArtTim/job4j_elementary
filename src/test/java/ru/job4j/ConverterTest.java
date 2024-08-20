package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float epsilon = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(epsilon));
    }

    @Test
    void whenConvert120RblThen2Dollars() {
        float input = 120;
        float expected = 2;
        float output = Converter.rubleToDollar(input);
        float epsilon = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(epsilon));
    }

    @Test
    void whenConver180RblThen3Dollars() {
        float input = 180;
        float expected = 3;
        float output = Converter.rubleToDollar(input);
        float epsilon = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(epsilon));
    }
}