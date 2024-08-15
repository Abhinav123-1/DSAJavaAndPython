package com.abhinav.array.basic;

public class FirstLastInArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        FirstLastInArraySolution flias = new FirstLastInArraySolution();
        System.out.println(flias.searchRange(nums, 8));
    }
}

class FirstLastInArraySolution{
    public int[] searchRange(int[] nums, int target) {
        int[] sol = new int[2];
        int start = 0;
        int end = nums.length-1;
        

        return sol;

    }
}
