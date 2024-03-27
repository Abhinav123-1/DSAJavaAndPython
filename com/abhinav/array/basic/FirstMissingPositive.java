package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,0,2};
        FirstMissingPositiveSolution fs = new FirstMissingPositiveSolution();
        System.out.println(fs.firstMissingPositive(nums));
    }
}

class FirstMissingPositiveSolution{
    public int firstMissingPositive(int[] nums) {
       
        Map<Integer,Integer> missingPositiveMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0 || nums[i]>nums.length){
                nums[i] = 0;
            }
            missingPositiveMap.putIfAbsent(nums[i], 1);
            if(missingPositiveMap.containsKey(nums[i])){
                missingPositiveMap.put(nums[i],missingPositiveMap.get(nums[i])+1);
            }
        }

        for(int i=0;i<=nums.length;i++){
             if(!missingPositiveMap.containsKey(i+1)){
                return i+1;
             }   
        }
        return nums.length;
        
    }
}