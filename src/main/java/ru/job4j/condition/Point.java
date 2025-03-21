package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        System.out.println("Result (0, 0) to (2, 0) " + distance(0, 0, 2, 0));
        System.out.println("Result 2 " + distance(1, 0, 0, 2));
        System.out.println("Result 2 " + distance(0, 3, 6, 1));
        System.out.println("Result 2 " + distance(3, 3, 1, 2));
    }
}
