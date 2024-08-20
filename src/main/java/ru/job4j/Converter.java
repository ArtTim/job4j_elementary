package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        System.out.println("120 rubles are " + rubleToDollar(120) + " dollars!");
        System.out.println("140 rubles are " + rubleToEuro(140) + " euro!");
        float dollarInput = 120;
        float dollarExpected = 2;
        float dollarOutput = rubleToDollar(dollarInput);
        boolean dollarPassed = dollarExpected == dollarOutput;
        float euroInput = 140;
        float euroExpected = 2;
        float euroOutput = rubleToEuro(euroInput);
        boolean euroPassed = euroExpected == euroOutput;
        System.out.printf("%s dollars are %s. Test result: " + dollarPassed + System.lineSeparator(), dollarInput, dollarExpected);
        System.out.printf("%s euro are %s. Test result: " + euroPassed, euroInput, euroExpected);
    }
}
