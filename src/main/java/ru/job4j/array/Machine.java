package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] changeSecond(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int i = 0;
        int debt = money - price;
        while (debt > 0) {
            debt -= coins[i];
            result[size] = coins[i];
            size++;
            if (debt < coins[i]) {
                i++;
            }
        }
        return Arrays.copyOf(result, size);
    }

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        money -= price;
        for (int coin : coins) {
            while (money >= coin) {
                money -= coin;
                result[size++] = coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
