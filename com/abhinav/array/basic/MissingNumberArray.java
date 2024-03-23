package com.abhinav.array.basic;

public class MissingNumberArray {
    public static void main(String[] args) {
        
    }
}

class MissingNumberArraySolution{
    public int missingNumber(int[] nums) {
     int n = nums.length;
     int sum = 0;
     int finalSum = 0;
     for(int i=0;i<n;i++){
        sum+=i;
     }   
     for(int i=0;i<n;i++){
        finalSum+=nums[i];
     }

     return sum-finalSum;

    }
}
