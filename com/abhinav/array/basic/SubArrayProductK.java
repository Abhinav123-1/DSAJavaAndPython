package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;

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
        int lowP = 0;
        while(lowP<nums.length){
            int highP = lowP+1;
            prod *= nums[lowP];
            if(prod<k){
                count ++;
            }
            while(highP<nums.length){
                prod *= nums[highP];
                if(prod<k){
                    count ++;
                }
                highP++;
            }
            prod =1;
            lowP++;
        }
       return count;
    }
}
