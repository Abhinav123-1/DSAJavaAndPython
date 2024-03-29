package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=daily-question&envId=2024-03-08
//try it tom
public class ElementsWithMaxFreq {
    public static void main(String[] args) {
        int[] nums = {1,1,5,3,6,4};
        ElementsWithMaxFreqSolution ewmfs = new ElementsWithMaxFreqSolution();
        System.out.println(ewmfs.maxFrequencyElements(nums));
    }
}

class ElementsWithMaxFreqSolution{
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> numsFreq =  new HashMap<>();
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(numsFreq.containsKey(nums[i])){
                numsFreq.put(nums[i],numsFreq.get(nums[i])+1);  
                count = Math.max(numsFreq.get(nums[i]), count);
            }else{
                numsFreq.put(nums[i], 1);
            }
            if (numMap.containsKey(numsFreq.get(nums[i])))
            numMap.put(numsFreq.get(nums[i]), numMap.get(numsFreq.get(nums[i])) + 1);
        else
        numMap.put(numsFreq.get(nums[i]), 1);
    }

    return numsFreq.get(count) * count;

           
    }
}
