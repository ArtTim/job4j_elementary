package ru.job4j;

public class RectangleArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        System.out.println(square(6, 2)); // 2
        System.out.println(square(4, 1)); // 1
        System.out.println(square(5, 1)); // 1
    }
}
