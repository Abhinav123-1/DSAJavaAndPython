package com.abhinav.array.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicates{
    public static void main(String[] args) {
    }
}

class FindAllDuplicatesSolution{
    //max comit
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> duMap = new HashMap<>();
        List<Integer> duList = new ArrayList<>();
        for(int num:nums){
            if(duMap.containsKey(num)){
                duList.add(num);
            }else{
                duMap.putIfAbsent(num, 1);
            }

        }
        return duList;
    }
}
