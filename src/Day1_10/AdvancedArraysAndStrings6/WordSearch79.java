package Day1_10.AdvancedArraysAndStrings6;

import java.util.Arrays;

public class WordSearch79 {
    boolean isVisited[][];
    public boolean exist(char[][] board, String word) {
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    isVisited = new boolean[board.length][board[0].length];
                    if(wordFound(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean wordFound(char[][] board, String word, int r, int c, int i) {
        if(i == word.length())
            return true;
        if( r<0 || c<0 || r== board.length || c== board[0].length || isVisited[r][c] || board[r][c] != word.charAt(i))
            return false;
        isVisited[r][c] = true;
        boolean val = wordFound(board,word,r+1,c,i+1) ||
                wordFound(board,word,r-1,c,i+1) ||
                wordFound(board,word,r,c+1,i+1) ||
                wordFound(board,word,r,c-1,i+1);
        isVisited[r][c] = false;
        return val;
    }
}