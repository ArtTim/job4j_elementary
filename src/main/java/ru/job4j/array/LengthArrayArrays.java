package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = new int[][] {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int[] el : array) {
            System.out.println(el.length);
        }
    }
}
