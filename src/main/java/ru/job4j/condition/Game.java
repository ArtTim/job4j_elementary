package ru.job4j.condition;

public class Game {
    public static void menu(String gameName) {
        if ("super mario".equals(gameName)) {
            System.out.println("Start - super mario");
        } else if ("tanks".equals(gameName)) {
            System.out.println("Start - tanks");
        } else if ("tetris".equals(gameName)) {
            System.out.println("Start - tetris");
        }
    }

}
