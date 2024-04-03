package com.abhinav.array.basic;

public class IsPerfectSquareBinary {
    public static void main(String[] args) {
        
    }
}

class IsPerfectSquareBinarySolution{
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        if(num==1) return true;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(mid*mid >= num){
                end = mid;
            }else{
                start = mid+1;
            }
        } 
        return start*start == num;

    }
}
