package ru.job4j.condition;

public class Games {
    public static void permissions(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.permissions(true, true);
        Games.permissions(true, false);
        Games.permissions(false, true);
        Games.permissions(false, false);
    }
}
