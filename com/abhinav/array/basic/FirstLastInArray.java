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
        //Still Stuck do it later
        int sol[] = {-1,-1};
        int start = 0;
        int startPos = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                sol[0] = mid;
                startPos = mid;
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
         end = nums.length-1;

        while(startPos<end){
            int mid = startPos + (end-startPos)/2;
            if(nums[mid] == target){
                sol[1] = mid;
                startPos = mid+1;                      
            }
            else if(nums[mid]<target){
                startPos = mid+1;
            }else{
                end = mid-1;
            }
        }

        return sol;

    }
}
