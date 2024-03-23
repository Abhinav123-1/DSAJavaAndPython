package com.abhinav.array.basic;

public class MoveZeros {
    public static void main(String[] args) {
        //[1,2,3,0,2,3,0,2];
    }
}

class MoveZerosSolution{
    public void moveZeroes(int[] nums) {
        //[0,1,0,3,12]
        //[1,1,0,3,12]
        //[1,1,3,3,12]
        if(nums.length<=1){
            return;
        }
        int nonZeroIndex = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex ++;
            }
        }
        while(nonZeroIndex!=nums.length-1){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;

        }
        
    }
}