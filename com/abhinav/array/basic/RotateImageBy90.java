package com.abhinav.array.basic;

public class RotateImageBy90 {
    public static void main(String[] args) {
        
    }
}

// 1 2 3 --> 7  4  1  
// 4 5 6 --> 8  5  2  
// 7 8 9 --> 9  6  3
class RotateImageBy90Solution{
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
    
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    
        for(int i=0;i<row;i++){
            for(int j=0;j<col/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][col-1-j];
                matrix[i][col-1-j]=temp;
            }
        }
       






    }
}
