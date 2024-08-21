package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String input = "Hi, bot";
        String output = DummyBot.answer(input);
        String expected = "Hi, smartAss!";
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String input = "Bye";
        String output = DummyBot.answer(input);
        String expected = "See you later.";
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String input = "";
        String output = DummyBot.answer(input);
        String expected = "I don't know. Please, ask another question.";
        assertThat(output).isEqualTo(expected);
    }
}