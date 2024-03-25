package com.abhinav.array.basic;

public class SetMatrixZero {
    public static void main(String[] args) {
        
    }
}

class SetMatrixZeroSolution{
    public void setZeroes(int[][] matrix) {
       int[]row = new int[matrix.length];
       int[]col = new int[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = Integer.MIN_VALUE;
                    col[j] = Integer.MIN_VALUE;

                }
            } 
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                 if (row[i] ==   Integer.MIN_VALUE|| col[j] == Integer.MIN_VALUE)
                 matrix[i][j] = 0;
            }
        }
    }
    
} 