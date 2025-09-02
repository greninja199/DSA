package Day1_10.AdvancedArraysAndStrings6;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public boolean checkNotComplete(int top, int bottom, int left, int right){
        return bottom >= top && right >= left;
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralMatrix = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(checkNotComplete(top,bottom,left,right)){
            for(int i=left;i<=right;i++)
                spiralMatrix.add(matrix[top][i]);
            top++;
            if(!checkNotComplete(top,bottom,left,right))
                break;
            for(int i=top;i<=bottom;i++)
                spiralMatrix.add(matrix[i][right]);
            right--;
            if(!checkNotComplete(top,bottom,left,right))
                break;
            for(int i=right;i>=left;i--)
                spiralMatrix.add(matrix[bottom][i]);
            bottom--;
            if(!checkNotComplete(top,bottom,left,right))
                break;
            for(int i=bottom;i>=top;i--)
                spiralMatrix.add(matrix[i][left]);
            left++;
        }
        return spiralMatrix;
    }
}
