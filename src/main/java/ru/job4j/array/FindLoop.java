package ru.job4j.array;

public class FindLoop {
    public static int indexInRange(int[] data, int element, int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int[] array, int element) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }
}
