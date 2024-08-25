package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] data, int target) {
        int i = 0;
        int j = data.length - 1;
        while (i < j) {
            if (data[i] + data[j] == target) {
                return new int[] {i, j};
            } else if (data[i] + data[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {};
    }
}
