package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean isPrime = num >= 2;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
