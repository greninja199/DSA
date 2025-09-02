package Day1_10.AdvancedArraysAndStrings6;
/*{
    boolean[][] isVisited;
    public boolean searchMatrix(int[][] matrix, int target) {
        isVisited = new boolean[matrix.length][matrix[0].length];
        return findValue(matrix, target, 0, matrix[0].length - 1);
    }

    private boolean findValue(int[][] matrix, int target, int r, int c) {
        if (r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length || isVisited[r][c])
            return false;
        isVisited[r][c] = true;
        if (target == matrix[r][c])
            return true;
        else if (target > matrix[r][c]) {
            return findValue(matrix, target, r + 1, c) || findValue(matrix, target, r, c + 1);
        } else {
            return findValue(matrix, target, r - 1, c) || findValue(matrix, target, r, c - 1);
        }
    }
}
*/
public class Search2dMatrixII240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while(r< matrix.length && c>-1){
            if(matrix[r][c] == target)
                return true;
            if(matrix[r][c] < target)
                r++;
            else
                c--;
        }
        return false;
    }
}

