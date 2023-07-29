package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Can't divide by 0");
        }
        if (number < 0) {
            System.out.println("It's a negative number");
        }
    }
}
