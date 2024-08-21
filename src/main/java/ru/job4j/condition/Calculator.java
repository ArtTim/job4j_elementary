package ru.job4j.condition;

public class Calculator {
    public static void plus(int x, int y) {
        System.out.println(x + y);
    }

    public static void minus(int x, int y) {
        System.out.println(x - y);
    }

    public static void main(String[] args) {
        plus(1, 2);
        plus(3, 6);
        minus(7, 3);
        minus(2, 6);
    }
}
