package ru.job4j.condition;

public class MathFunction {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = func1(3);
        int result2 = func2(5);
        int result3 = func1(100);
    }
}