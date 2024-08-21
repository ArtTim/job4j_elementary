package ru.job4j.condition;

public class Club {
    public static void permissions(boolean hasMoney, boolean isFriend) {
        if (hasMoney || isFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permissions(true, true);
        permissions(true, false);
        permissions(false, true);
        permissions(false, false);
    }
}
