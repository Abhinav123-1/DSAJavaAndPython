package com.abhinav.array.basic;

public class SubArraySumDivByk {
    public static void main(String[] args) {
        int [] nums = {4,5,0,-2,-3,1};
        int k = 5;
        SubArraySumDivBykSolution sasdbks = new SubArraySumDivBykSolution();
        System.out.println(sasdbks.subarraysDivByK(nums, k));
    }
}

class SubArraySumDivBykSolution{
    public int subarraysDivByK(int[] nums, int k) {
        // [4,5,0,-2,-3,1], k = 5
        int count = 0;
        int lowP = 0;
        int sum = 0;
        while(lowP<nums.length){
            int highP = lowP+1;
            sum+=nums[lowP];
            if(sum%k==0){
                count++;
            }
            while(highP<nums.length){
                sum+=nums[highP];
                if(sum%k==0){
                    count++;
                }
                highP++;
            }
            lowP++;
            sum = 0;
        }
        sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%k==0){
            count++;
        }
        return count;

        
    }
}
