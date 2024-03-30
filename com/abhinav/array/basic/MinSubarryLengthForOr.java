package com.abhinav.array.basic;

public class MinSubarryLengthForOr {
    public static void main(String[] args) {
        int nums[] = {1,2};
        int k = 0 ;
        MinSubarryLengthForOrSolution mslfos = new MinSubarryLengthForOrSolution();
        System.out.println(mslfos.minimumSubarrayLength(nums, k));

    }
}

class MinSubarryLengthForOrSolution{
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= k) {
                return 1; 
            }
            int currentOr = 0;
            for (int j = i; j < n; j++) {
                currentOr |= nums[j];
                if (currentOr >= k) {
                    minLength = Math.min(minLength, j - i + 1);
                    break;
                }
            }
        }

        return minLength != Integer.MAX_VALUE ? minLength : -1;
       // return minLength == Integer.MAX_VALUE ? minLength : -1;
    }
}
