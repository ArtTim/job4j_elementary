package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 3));
        System.out.println(max(2, 2));
    }
}
