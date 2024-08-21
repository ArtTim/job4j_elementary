package ru.job4j.condition;

public class Fit {
    public static double calculateWeight(short height, int baseHeight) {
        return (height - baseHeight) * 1.15;
    }

    public static double calculateManWeight(short height) {
        return calculateWeight(height, 100);
    }

    public static double calculateWomanWeight(short height) {
        return calculateWeight(height, 110);
    }

    public static void main(String[] args) {
        short height = 177;
        System.out.printf("Man with height %s cm has ideal weight: %.2f kg %s", height, calculateManWeight(height), System.lineSeparator());
        System.out.printf("Woman with height %s cm has ideal weight %.2f kg %s", height, calculateWomanWeight(height), System.lineSeparator());
    }
}
