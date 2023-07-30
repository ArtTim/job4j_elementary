package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int num) {
        String result;
        if (num % 3 == 0 && num % 2 == 0) {
            result = "The number divides by 6.";
        } else if (num % 3 == 0 && num % 2 != 0) {
            result = "The number divides by 3, but it isn't the even number.";
        } else if (num % 3 != 0 && num % 2 == 0) {
            result = "The number doesn't divide by 3, but it is the even number.";
        } else {
            result = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return result;
    }
}
