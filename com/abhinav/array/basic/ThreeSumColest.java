package com.abhinav.array.basic;

import java.util.Arrays;

public class ThreeSumColest {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        //-4,-1,1,2
        int target = 0;
        ThreeSumColestSolution tscs = new ThreeSumColestSolution();
        System.out.println(tscs.threeSumClosest(nums, target));
    }
}

class ThreeSumColestSolution{
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int sum = 0;
        int closetInt =  Integer.MAX_VALUE;
        while(low<high){
            sum += nums[low];
            mid= low+1;
            if(mid!=high){
                sum+=nums[mid]+nums[high];
            }else{
                high = nums.length-1;
                sum = 0;
                while(mid<high){
                    sum+=nums[mid]+nums[high]+nums[low];
                    high--; 
                    int temp = Math.abs(target - sum);
                    closet = Math.min(closet,temp);
                    if(temp<=closet){
                        closetInt = sum;
                    }
                    sum=0;
                    if(high==mid){
                        high = nums.length-1;
                        mid++;
                        sum = 0;
                    }
                }
                low++;
                high=nums.length-1;
                sum = 0;
                continue;
            }
            int temp = Math.abs(target - sum);
            closet = Math.min(closet,temp);
            if(temp<=closet){
                closetInt = sum;
            }
            high--;
            sum = 0;
        }
        return closetInt;
    }
}
