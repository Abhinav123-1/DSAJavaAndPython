package com.abhinav.array.basic;

public class SortColours {
    public static void main(String[] args) {
        
    }
}

class SortColoursSolution{
    public void sortColors(int[] nums) {
        int low,mid;
        int high;
        low = mid = 0;
        high = nums.length-1;
        while(high<=mid){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}
