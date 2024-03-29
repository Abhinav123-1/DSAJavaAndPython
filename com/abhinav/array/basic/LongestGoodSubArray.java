package com.abhinav.array.basic;

import java.util.HashMap;

public class LongestGoodSubArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,1,2};
        LongestGoodSubArraySolution lgsas = new LongestGoodSubArraySolution();
        System.out.println(lgsas.maxSubarrayLength(nums, 2));

    }
}

class LongestGoodSubArraySolution{
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
            while (mp.get(nums[r]) > k) {
                mp.put(nums[l], mp.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;  
    }
}
