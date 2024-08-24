package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class EndsWithTest {

    @Test
    void whenEndsWithPostfixThenTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = new char[] {'l', 'o'};
        boolean output = EndsWith.endsWith(word, postfix);
        assertThat(output).isTrue();
    }

    @Test
    void whenNotEndsWithPostfixThenFalse() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = new char[] {'q', 'o'};
        boolean output = EndsWith.endsWith(word, postfix);
        assertThat(output).isFalse();
    }
}