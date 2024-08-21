package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("The age of the customer is: " + age);
        if (age >= 18) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Sorry! It's not for you");
        }
    }

}
