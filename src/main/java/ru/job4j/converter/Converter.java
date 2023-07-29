package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euroIn = 140;
        float euroExpected = 2;
        float euroOut = rubleToEuro(euroIn);
        boolean euroPassed = euroExpected == euroOut;
        float dollarIn = 120;
        float dollarExpected = 2;
        float dollarOut = rubleToDollar(dollarIn);
        boolean dollarPassed = dollarExpected == dollarOut;

        System.out.println("140 rubles are " + rubleToEuro(140) + " euro");
        System.out.println("140 rubles are " + rubleToDollar(140) + " dollars");
        System.out.println("140 rubles are 2 euro: " + euroPassed);
        System.out.println("140 rubles are 2 dollars: " + dollarPassed);
    }
}
