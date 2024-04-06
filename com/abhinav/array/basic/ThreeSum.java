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
        List<Integer> sumList  = new ArrayList<>();
        List<List<Integer>> combinedList = new ArrayList<>();
        int k = 0;
        int sum = 0;
        //-4,-1,-1,0,1,2 
        
        return combinedList; 
    }
}