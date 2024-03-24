package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1,1,1,1};
        long k = 3;
        LongestSubArrayWithSumKSolutiopn lsawsks = new LongestSubArrayWithSumKSolutiopn();
        System.out.println(lsawsks.longestSubarrayWithSumK(a, k));


    }
}

class LongestSubArrayWithSumKSolutiopn{
    public static int longestSubarrayWithSumK(int []a, long k) {
        Map<Integer,Integer> prefixMap = new HashMap<>();
        int sum  =0;
        int maxLength = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
            
            if (sum == k)
                maxLength = i + 1;
            else if (prefixMap.containsKey(sum - k))
                maxLength = Math.max(maxLength, i - prefixMap.get(sum - k));
            
            if (!prefixMap.containsKey(sum))
            prefixMap.put(sum, i);

        }
        return maxLength;


    }
}