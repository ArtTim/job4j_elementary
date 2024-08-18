package ru.job4j;

public class Converter {
    public static float roubleToEuro(float value) {
        return value / 70;
    }

    public static float roubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        System.out.println("120 roubles are " + roubleToDollar(120) + " dollars!");
        System.out.println("140 roubles are " + roubleToEuro(140) + " euro!");
    }
}
