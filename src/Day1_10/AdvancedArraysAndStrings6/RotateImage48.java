package Day1_10.AdvancedArraysAndStrings6;

public class RotateImage48 {
    public void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }

    public void rotate(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;

        while (top < bottom) {
            for (int i = 0; i < matrix[0].length; i++)
                swap(matrix, top, i, bottom, i);
            top++;
            bottom--;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++)
                swap(matrix, i, j, j, i);
        }
    }
}
