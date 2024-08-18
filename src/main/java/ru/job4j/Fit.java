package ru.job4j;

/*
Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
 */

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 177;
        System.out.printf("Man %s is " + manWeight(height) + System.lineSeparator(), height);
        System.out.printf("Man %s is " + womanWeight(height) + System.lineSeparator(), height);
    }
}
