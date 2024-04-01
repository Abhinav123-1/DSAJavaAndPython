package com.abhinav.array.basic;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        SearchInsertPositionSolution sipos = new SearchInsertPositionSolution();
        System.out.println(sipos.searchInsert(nums, target));
    }
}

class SearchInsertPositionSolution{
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return start;
        
    }
}
