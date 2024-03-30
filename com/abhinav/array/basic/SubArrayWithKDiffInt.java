package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class SubArrayWithKDiffInt {
    public static void main(String[] args) {
        
    }
}
class SubArrayWithKDiffIntSolution{
    public int subarraysWithKDistinct(int[] nums, int k) {
       Map<Integer,Integer> countMap1 = new HashMap<>();
       Map<Integer,Integer> countMap2 = new HashMap<>();
       int left1 = 0;
       int left2 = 0;
       int tc = 0;
       for(int right=0;right<nums.length;right++){
        countMap1.put(nums[right],countMap1.getOrDefault(nums[right], 0)+1);
        countMap2.put(nums[right],countMap2.getOrDefault(nums[right], 0)+1);

        while(countMap1.size()>k){
            countMap1.put(nums[left1],countMap1.get(left1)-1);
            if(countMap1.get(nums[left1])==0){
                countMap1.remove(nums[left1]);
            }
            left1++;
        }

        while(countMap2.size()>k-1){
            countMap2.put(nums[left2],countMap2.get(nums[left2])-1);
            if(countMap2.get(nums[left2])==0){
                countMap2.remove(nums[left2]);
            }
            left2++;
        }
        tc+=left2-left1;


       }
       return tc;

    }
}
