package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
    public static void main(String[] args) {
        
    }
    
}

class MajorityElementSolution{
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<>();
      //  int length = nums.length;
        int count = 0;
        int ele = 0;
        for(int num:nums){
            if(countMap.containsKey(num)){
                countMap.put(num, countMap.get(num)+1);  
            }else{
                countMap.put(num, 1);
            }
        }

        for(Entry<Integer,Integer> entry:countMap.entrySet()){
            int key = (int)entry.getKey();
            int value = (int)entry.getKey();
            count = Math.max(count,value);
            if(value == count){
                ele = key;
            }
        }

        return ele;


    }
}
