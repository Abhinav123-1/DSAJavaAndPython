package com.abhinav.array.basic;

public class RotateArrayByK {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        RotateArrayByKSolution rabks = new RotateArrayByKSolution();
        rabks.rotate(nums, 3);
    }
    
}

class RotateArrayByKSolution{
    public void rotate(int[] arr, int k) {
       //1,2,3,4,5,6,7
       //0,1,2,3,4,5,6
       //K = 3
       //5,6,7,1,2,3,4
       for(int i=0;i<arr.length;i++){
        int temp  = arr[(i+k)%arr.length];
        arr[(i+k)%arr.length] = arr[i];
        arr[i] = temp;
       }

       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);

       }
   }
}
