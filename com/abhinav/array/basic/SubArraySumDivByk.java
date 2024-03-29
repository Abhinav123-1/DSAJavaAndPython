package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumDivByk {
    public static void main(String[] args) {
        int [] nums = {4,5,0,-2,-3,1};
        int k = 5;
        SubArraySumDivBykSolution sasdbks = new SubArraySumDivBykSolution();
        System.out.println(sasdbks.subarraysDivByK(nums, k));
    }
}

class SubArraySumDivBykSolution{
    public int subarraysDivByK(int[] nums, int k) {
        // [4,5,0,-2,-3,1], k = 5
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;
        map.put(0, 1);
        for (int num: nums){
            prefixSum += num;
            int mod = prefixSum % k ;
            if (mod < 0) {
                mod += k;
            }
            maxLength += map.getOrDefault(mod,0);
            map.put(mod, map.getOrDefault(mod,0) + 1);

    }
    return maxLength; 

}
}
