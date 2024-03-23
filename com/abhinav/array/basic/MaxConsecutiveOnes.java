package com.abhinav.array.basic;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        
    }
}

class MaxConsecutiveOnesSolution{
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i==sum){
                continue;
            }else{
                maxSum = Math.max(sum,maxSum);
                sum = 0;
            }
        }


        return maxSum;
    
        
    }
}
