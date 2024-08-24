package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
            boolean isMono = true;
            for (int i = 0; i < board[row].length; i++) {
                if (board[row][i] != board[row][0]) {
                    isMono = false;
                    break;
                }
            }
            return isMono;
    }
}
