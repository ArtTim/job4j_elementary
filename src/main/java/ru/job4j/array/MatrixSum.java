package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] data) {
        int result = 0;
        for (int[] el : data) {
            for (int nums : el) {
                result += nums;
            }
        }
        return result;
    }
}
