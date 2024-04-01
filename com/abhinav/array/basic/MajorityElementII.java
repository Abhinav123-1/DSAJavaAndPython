package com.abhinav.array.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElementII {
    public static void main(String[] args) {
        //int nums[] = {3,2,3};

    }
}

class MajorityElementIISolution{
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        Map<Integer,Integer>countMap = new HashMap<>();
        int major = nums.length/3;
        for(int i=0;i<nums.length;i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i], 1)+1);
        }
        for(Entry<Integer,Integer> entry: countMap.entrySet()){
            if((int)entry.getValue() > major){
                numList.add((int) entry.getKey());
            }
        }
        return numList;
    }
}
