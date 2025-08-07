package RecursionAndBacktracking13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class NQueens51 {

    int[][] board;
    List<List<String>> result;

    public List<List<String>> solveNQueens(int n) {
        board = new int[n][n];
        result = new ArrayList<>();

        placeQueens(0);
        return result;
    }

    private void placeQueens(int r) {
        if (r == board.length) {
            addToResult();
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isOkay(r, i)) {
                board[r][i] = 1;
                placeQueens( r + 1);
                board[r][i] = 0;
            }
        }

    }

    private void addToResult() {
        List<String> temp = new ArrayList<>();
        for (int[] row: board) {
            StringBuilder s = new StringBuilder();
            for (int i: row)
                s.append((i==0)?".":"Q");
            temp.add(s.toString());
        }
        result.add(temp);
    }

    public boolean isOkay(int r, int c) {
        return (moveOkay(r - 1, c, -1, 0) &&
                moveOkay(r - 1, c - 1, -1, -1) &&
                moveOkay(r - 1, c + 1, -1, 1));
    }

    private boolean moveOkay(int r, int c, int d1, int d2) {
        while (r >= 0 && r < board.length && c >= 0 && c < board.length) {
            if (board[r][c] == 1)
                return false;
            c += d2;
            r += d1;
        }
        return true;
    }
}
