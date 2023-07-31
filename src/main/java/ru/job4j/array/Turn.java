package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] revert = back(nums);
        for (int num : revert) {
            System.out.println(num);
        }
    }
}
