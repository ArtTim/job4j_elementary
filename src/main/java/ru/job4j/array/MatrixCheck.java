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

    public static boolean monoVertical(char[][] board, int column) {
        boolean isMono = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != board[0][column]) {
                isMono = false;
                break;
            }
        }
        return isMono;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] array = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            array[i] = board[i][i];
        }
        return array;
    }
}