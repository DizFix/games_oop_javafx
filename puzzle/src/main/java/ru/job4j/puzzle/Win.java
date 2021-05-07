package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board, int sz) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[sz][index] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean monoVertical(int[][] board, int sz) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][sz] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1) {
                if (Win.monoHorizontal(board, index) || Win.monoVertical(board, index)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }
}
