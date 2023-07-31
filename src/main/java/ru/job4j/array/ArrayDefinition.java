package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Korobeinikov Stas, спасибо, что поправляешь мой ужасный код <3";
        names[1] = "Петр Арсентьев";
        names[2] = "Esipov Alexey";
        names[3] = "Andrei Hincu";

        for (String name : names) {
            System.out.println(name);
        }
    }
}