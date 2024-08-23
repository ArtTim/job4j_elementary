package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
//        00 11 22 33 44
//        40 31 22 13 00
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = row + cell == size - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Dry by 3");
        draw(3);
        System.out.println("Dry by 5");
        draw(5);
    }
}
