package ru.job4j.condition;

public class SquareArea {
    public static double area(double p, double k) {
        double h = p / (2 * (k + 1));
        return (h * k) * h;
    }

    public static void main(String[] args) {
        System.out.println(area(6, 2));
    }
}
