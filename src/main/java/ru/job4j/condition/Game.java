package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - Super Mario");
        }
        if ("tanks".equals(name)) {
            System.out.println("Start - Tanks");
        }
        if ("tetris".equals(name)) {
            System.out.println("Start - Tetris");
        }
    }
}
