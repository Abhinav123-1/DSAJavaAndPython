package com.abhinav.array.basic;

public class HarshadNumber {
    public static void main(String[] args) {
        int x = 25;
        HarshadNumberSolution hns = new HarshadNumberSolution();
        System.out.println(hns.sumOfTheDigitsOfHarshadNumber(x));
    }
}

class HarshadNumberSolution{
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int temp  =x;
        while(temp>=1){
            int rem  = temp%10;
            temp/=10;
            sum+=rem;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
        
    }
}
