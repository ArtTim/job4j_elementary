package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("Age of the customer is: " + age);
        if (age > 18) {
            System.out.println("Welcome to the cinema");
        } else {
            System.out.println("It isn't for you");
        }
    }
}
