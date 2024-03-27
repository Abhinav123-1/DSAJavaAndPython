package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;

public class SubArrayEqualSumK {
    public static void main(String[] args) {
        
    }
}

class SubArrayEqualSumKSolution{
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer,Integer>prefixSum = new HashMap<>();
        prefixSum.put(0, 1);

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int remove = sum - k;
            count += prefixSum.getOrDefault(remove, 0);
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        } 

        return count;
    }

}


