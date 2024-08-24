package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] data, int target) {
        int i = 0;
        int j = 1;
        while (i < data.length - 1) {
            if (data[i] + data[j] == target) {
                return new int[] {i, j};
            } else if (j == data.length - 1 && data[j] + data[i] != target) {
                j = 1;
                i++;
            }
            j++;
        }
        return new int[] {};
    }
}
