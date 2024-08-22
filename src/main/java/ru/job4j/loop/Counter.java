package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(8, 5));
        System.out.println(sum(1, 1));

    }
}
