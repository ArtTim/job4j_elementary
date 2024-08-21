package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String result = "I don't know. Please, ask another question.";
        if ("Hi, bot".equals(question)) {
            result = "Hi, smartAss!";
        }
        if ("Bye".equals(question)) {
            result = "See you later.";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(answer("Hi, bot"));
        System.out.println(answer("Bye"));
        System.out.println(answer(""));
    }
}
