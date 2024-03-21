package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        
    }
}

class TwoSumSolution{
    public int[] twoSum(int[] nums, int target) {
        int [] sol = new int[2];
        Map <Integer,Integer> solMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res = target - nums[i];
            if(solMap.containsKey(res)){
                sol[0]  = i;
                sol[1] = solMap.get(res);
            }
            solMap.put(nums[i], i);
        }
    return sol;      
    }
}