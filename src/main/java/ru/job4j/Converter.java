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
        float dollarInput = 120;
        float dollarExpected = 2;
        float dollarOutput = roubleToDollar(dollarInput);
        boolean dollarPassed = dollarExpected == dollarOutput;
        float euroInput = 140;
        float euroExpected = 2;
        float euroOutput = roubleToEuro(euroInput);
        boolean euroPassed = euroExpected == euroOutput;
        System.out.printf("%s dollars are %s. Test result: " + dollarPassed + System.lineSeparator(), dollarInput, dollarExpected);
        System.out.printf("%s euro are %s. Test result: " + euroPassed, euroInput, euroExpected);
    }
}
