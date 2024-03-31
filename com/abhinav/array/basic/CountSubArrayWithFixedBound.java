package com.abhinav.array.basic;

public class CountSubArrayWithFixedBound {
    public static void main(String[] args) {
        int nums[] = {1,3,5,2,7,5};
        int mink = 1;
        int maxK = 5;
        CountSubArrayWithFixedBoundSolution csawfbs = new CountSubArrayWithFixedBoundSolution();
        System.out.println(csawfbs.countSubarrays(nums, mink, maxK));

    }
}

class CountSubArrayWithFixedBoundSolution{
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n=nums.length;
        long ans=0;
        int maxI=-1;
        int minI=-1;
        int start=0;
        for(int i=0;i<n;i++){
            if(nums[i]<minK || nums[i]>maxK){
                minI=maxI=-1;
                start=i+1;
            }
            if(nums[i]==minK){
                minI=i;
            }
            if(nums[i]==maxK){
                maxI=i;
            }
            ans=ans+Math.max(0L,Math.min(minI,maxI)-start+1);
        }
        return ans;
      } 
    }
