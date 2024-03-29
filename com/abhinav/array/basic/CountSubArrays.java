package com.abhinav.array.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSubArrays {
    public static void main(String[] args) {
        
    }
}

class CountSubArraysSolution{
    public long countSubarrays(int[] nums, int k) {
        long count = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        int maxNum = Arrays.stream(nums).max().getAsInt();
        int maxInWindow = 0;
        int n = nums.length;

        for(leftPointer = 0;leftPointer<n;leftPointer++){
            while(rightPointer<n && maxInWindow<k){
                if(nums[rightPointer]==maxNum){
                    maxInWindow++;
                }
                rightPointer++;
            }
             if(maxInWindow<k){
                break;
             }
             count += n-rightPointer+1;
           
             if (nums[leftPointer] == maxNum) {
                maxInWindow--;
            }
        }



        return count;
       
}
}