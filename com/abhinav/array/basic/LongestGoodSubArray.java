package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;

public class LongestGoodSubArray {
    public static void main(String[] args) {
        
    }
}

class LongestGoodSubArraySolution{
    public int maxSubarrayLength(int[] nums, int k) {
        int count = 0;
        Map<Integer,Integer> subArrayMap = new HashMap<>();
        for(int num: nums){
            if(!subArrayMap.containsKey(num)){
                subArrayMap.put(num, 1);
            }else{
                subArrayMap.put(num, subArrayMap.get(num)+1);
            }
        }
        




        return count;

        
    }
}
