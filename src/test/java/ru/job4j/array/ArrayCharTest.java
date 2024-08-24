package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ArrayCharTest {

    @Test
    void whenStartsWithPrefixThenTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = new char[] {'H', 'e'};
        boolean output = ArrayChar.startsWith(word, prefix);
        assertThat(output).isTrue();
    }

    @Test
    void whenStartsNotWithPrefixThenFalse() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = new char[] {'J', 'e'};
        boolean output = ArrayChar.startsWith(word, prefix);
        assertThat(output).isFalse();
    }
}