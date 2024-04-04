package com.abhinav.array.basic;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        SquaresOfSortedArraySolution sosas =  new SquaresOfSortedArraySolution();
        System.out.println(sosas.sortedSquares(nums).toString());

    }
}
//[-4,-1,0,3,10]
//[,16,100]
class SquaresOfSortedArraySolution{
    public int[] sortedSquares(int[] nums) {
        int [] squareOnes = new int[nums.length];
        int lowPointer = 0;
        int highPointer = nums.length-1;
        int i = highPointer;
        while(lowPointer<=highPointer){
            int sqLowPointer = (int) Math.pow(nums[lowPointer], 2);
            int sqHighPointer =  (int) Math.pow(nums[highPointer], 2);
            if(sqHighPointer > sqLowPointer ){
                squareOnes[i] = sqHighPointer;
                highPointer--;
            }else{
                squareOnes[i] = sqLowPointer;
                lowPointer++;
            }
            i--;
        }
        return squareOnes;
    }
}
