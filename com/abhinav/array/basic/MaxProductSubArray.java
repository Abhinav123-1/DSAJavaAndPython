package com.abhinav.array.basic;

public class MaxProductSubArray {
    public static void main(String[] args) {
        
    }
}

class MaxProductSubArraySolution{
    public int maxProduct(int[] nums) {
        int prod = Integer.MIN_VALUE;

        int currMax = 1;
        int currMin = 1 ;
        for(int num:nums){
            prod = Math.max(prod,num);

        }
        for(int num: nums){
            int temp = currMax*num;
            currMax = Math.max(currMax*num,currMin*num);
            currMax = Math.max(currMax,num);
            currMin = Math.min(temp*num,currMin*num);
            currMin = Math.min(temp,num);
            prod = Math.max(prod,currMax);
        }
        return prod; 
    }
}
