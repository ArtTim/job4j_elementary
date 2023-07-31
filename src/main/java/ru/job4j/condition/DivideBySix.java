package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int num) {
        String result;
        if (num % 3 == 0 && num % 2 == 0) {
            result = "The number is divisible by 6";
        } else if (num % 3 == 0) {
            result = "The number is divisible by 6, but, it's an even number.";
        } else if (num % 2 == 0) {
            result = "The number isn't divisible by 6, but it's an even number.";
        } else {
            result = "The number isn't divisible by 6 and it isn't an even number.";
        }
        return result;
    }
}