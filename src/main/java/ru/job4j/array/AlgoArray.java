package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 2, 4};
        int temp = array[0];
        array[0] = array[2];
        array[2] = temp;
        temp = array[1];
        array[1] = array[3];
        array[3] = temp;
        temp = array[2];
        array[2] = array[3];
        array[3] = temp;
        array[3] = array[4];
        array[4] = temp;
        for (int a : array) {
            System.out.println(a);
        }
    }
}