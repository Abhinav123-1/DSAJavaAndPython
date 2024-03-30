package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;

public class CommonElementsinArray {
    public static void main(String[] args) {
        int[] nums1 = {3,4,2,3};
        int[] nums2 = {1,5};
        CommonElementsinArraySolution ceias = new CommonElementsinArraySolution();
        ceias.findIntersectionValues(nums1, nums2);
    }
}

class CommonElementsinArraySolution{
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int [] solArray = new int[2];
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int num: nums2){
            countMap.put(num, countMap.getOrDefault(num,0) + 1);        
        }
        for(int num: nums1){
            if(countMap.containsKey(num)){
                solArray[0]+=1;
                if(countMap.get(num)!=101){
                    solArray[1]+=countMap.get(num);
                    countMap.put(num, 101);
                }
            }
        }
       

        return solArray;
        
    }
}
