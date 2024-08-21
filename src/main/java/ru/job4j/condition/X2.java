package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * (x * x) + b * x + c;
    }

    public static void main(String[] args) {
        System.out.println(calc(10, 0, 0, 2));
        System.out.println(calc(1, 1, 1, 1));
        System.out.println(calc(0, 1, 1, 1));
        System.out.println(calc(1, 1, 0, 1));
        System.out.println(calc(1, 1, 1, 0));
    }

    public static class Tour {
        public static void offer(boolean passport) {
            System.out.println("Client has foreign passport: " + passport);
            if (passport) {
                System.out.println("Tours aboard");
            } else {
                System.out.println("Tours in Russia");
            }
        }

        public static void main(String[] args) {
            offer(true);
            offer(false);
        }
    }
}
