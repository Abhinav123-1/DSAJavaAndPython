package com.abhinav.array.basic;

public class MinInSortedReotatedArray {
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        MinInSortedReotatedArraySolution misreas = new MinInSortedReotatedArraySolution();
        System.out.println(misreas.findMin(nums));
    }
}

class MinInSortedReotatedArraySolution{
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }else{
                high = mid-1;               
            }
            min = Math.min(min,nums[mid]);
        }
        return min;  
     }
}
