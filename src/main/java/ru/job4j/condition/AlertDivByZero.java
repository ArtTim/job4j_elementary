package ru.job4j.condition;

public class AlertDivByZero {
    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Couldn't divide by zero.");
        }
        if (number < 0) {
            System.out.println("This is negative number.");
        }
    }

    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(-5);

    }
}
