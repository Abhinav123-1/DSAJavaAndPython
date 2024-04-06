package com.abhinav.array.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        
    }
}

class FourSumSolution{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> combinedList = new ArrayList<>();
        if (n < 4) {
            return combinedList;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int leftPointer = j + 1, rightPointer = n - 1;
              
                while (leftPointer < rightPointer) {
                    long currentSum = (long) nums[i] + nums[j] + nums[leftPointer] + nums[rightPointer];
                  
                    if (currentSum < target) {
                        ++leftPointer;
                    } 
                    else if (currentSum > target) {
                        --rightPointer;
                    } 
                    else {
                        combinedList.add(Arrays.asList(nums[i], nums[j], nums[leftPointer], nums[rightPointer]));
                        leftPointer++;
                        rightPointer--;
                        while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer - 1]) {
                            leftPointer++;
                        }
                        while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer + 1]) {
                            rightPointer--;
                        }
                    }
                }
            }
        }
        return combinedList;

        
    }
}
