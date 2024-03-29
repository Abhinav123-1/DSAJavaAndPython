package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=daily-question&envId=2024-03-08
//try it tom
public class ElementsWithMaxFreq {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4,5,3,1};
        ElementsWithMaxFreqSolution ewmfs = new ElementsWithMaxFreqSolution();
        System.out.println(ewmfs.maxFrequencyElements(nums));
    }
}

class ElementsWithMaxFreqSolution{
    //1,2,1,2,3,4
    public int maxFrequencyElements(int[] nums) {
       Map<Integer,Integer> countMap = new HashMap<>();
       int max = 1;
       int count = 0;
       for(int i=0; i<nums.length;i++){
        if(countMap.containsKey(nums[i])){
            countMap.put(nums[i], countMap.get(nums[i])+1);
            max = Math.max(max,countMap.get(nums[i]));
        }else{
            countMap.put(nums[i], 1);
  
        }
       }
       for(Entry entry: countMap.entrySet()){
        if((int)entry.getValue() == max){
            count ++;
        }
       }
       return max*count;   
    }
}
