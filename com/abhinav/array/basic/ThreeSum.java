package com.abhinav.array.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-4,-1,-1,0,1,2 };
        ThreeSumSolution tss = new ThreeSumSolution();
        System.out.println(tss.threeSum(nums));

        
    }
}

class ThreeSumSolution{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> combinedlist = new ArrayList<>();
        int length = nums.length;
        for (int low = 0; low < length - 2 && nums[low] <= 0; ++low) {
            if (low > 0 && nums[low] == nums[low - 1]) {
                continue;
            }
            int mid = low + 1;
            int high = length - 1;
            while (mid < high) {
                int sum = nums[low] + nums[mid] + nums[high];
                if (sum < 0) {
                    ++mid;
                }
                else if (sum > 0) {
                    --high;
                }
                else {
                    combinedlist.add(List.of(nums[low], nums[mid], nums[high]));
                    while (mid < high && nums[mid] == nums[mid + 1]) {
                        ++mid;
                    }
                    while (mid < high && nums[high] == nums[high - 1]) {
                        --high;
                    }
                    ++mid;
                    --high;
                }
            }
        }
        return combinedlist;
    }
}