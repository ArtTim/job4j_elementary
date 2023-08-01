package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        for (int i = 0; i < post.length; i++) {
            int wordIndex = word.length - 1 - i;
            int postIndex = post.length - 1 - i;
            if (word[wordIndex] != post[postIndex]) {
                return false;
            }
        }
        return result;
    }
}
