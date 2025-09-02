package Day1_10.AdvancedArraysAndStrings4;

public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
        if(matrix.length==0)
            return;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0)
                        firstRowZero=true;
                    if(j==0)
                        firstColZero=true;
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i= matrix.length-1;i>=0;i--){
            for(int j=matrix[0].length-1;j>=0;j--){
                if(i==0){
                    if(firstRowZero)
                        matrix[i][j]=0;
                }
                else if (j==0){
                    if(firstColZero)
                        matrix[i][j]=0;
                }
                else if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }

    }
}
