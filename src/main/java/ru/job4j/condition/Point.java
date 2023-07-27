package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double resultX = Math.pow(x2 - x1, 2);
        double resultY = Math.pow(y2 - y1, 2);
        return Math.sqrt(resultX + resultY);
    }

    public static void main(String[] args) {
        System.out.println("Result (0, 0) to (2, 0) = " + distance(0, 0, 2, 0));
    }
}
