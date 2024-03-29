package com.abhinav.array.basic;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[]nums = {1,1};
        SetMismatchSolution sms = new SetMismatchSolution();
        sms.findErrorNums(nums);
    }
}

class SetMismatchSolution{
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[]res = new int[2];
        int sum = 0;
        int finalSum = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i] ){
                res[0] = nums[i];
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            sum+=i;
            finalSum+=nums[i];
        }
        sum+=nums.length;
       res[1] = sum-(finalSum-res[0]);
       return res;

    }
}
