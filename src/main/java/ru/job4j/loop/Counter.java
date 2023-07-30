package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            result += i;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        sum(0, 10);
        sum(3, 8);
        sum(1, 1);
    }
}
