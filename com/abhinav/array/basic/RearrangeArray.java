package com.abhinav.array.basic;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        RearrangeArraySolution ras = new RearrangeArraySolution();
        nums = ras.rearrangeArray(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        
    }
}

class RearrangeArraySolution{
    public int[] rearrangeArray(int[] nums) {
        //[3,1,-2,-5,2,-4]
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]> 0){
                positiveList.add(nums[i]);
            }else{
                negativeList.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length/2;i++){
      
            nums[2*i] = positiveList.get(i);
            nums[2*i+1] = negativeList.get(i);
        }
        return nums;

    }
}
