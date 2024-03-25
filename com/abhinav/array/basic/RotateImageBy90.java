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
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];

for(int j=0;j<matrix.length;j++){
    for(int i=0;i<matrix.length;i++){
        row[i] = matrix[0][j];
 }
 for(int i=0;i<matrix[0].length;i++){
     col[i] = matrix[i][j];
}   
}
       






    }
}
