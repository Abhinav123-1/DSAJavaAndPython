package com.abhinav.array.basic;

public class SubArrayProductK {
    public static void main(String[] args) {
        int[] nums= {10,5,2,6};
        SubArrayProductKSolution sapks = new SubArrayProductKSolution();
        System.out.println(sapks.numSubarrayProductLessThanK(nums, 100));
    
    }
}

class SubArrayProductKSolution{
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        long prod = 1;
        int count = 0;
        if(k == 0 || k==1){
            return 0;
        }
        int left = 0;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            while(prod>=k){
                prod/=nums[left];
                left++;
            }
            count+=i-left+1;
        }
       return count;
    }
}
