package com.abhinav.array.basic;

public class CheckifArrayisSortedLeet {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 1, 2, 3, 5 };
        CheckifArrayisSortedLeetSolution ciaisls = new CheckifArrayisSortedLeetSolution();
        System.out.println(ciaisls.check(nums));
    }
}

class CheckifArrayisSortedLeetSolution {
    public boolean check(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        int n = nums.length;
        int sorted = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                sorted++;
            }
        }
        if (sorted > 1) {
            return false;
        }
        return true;

    }
}
