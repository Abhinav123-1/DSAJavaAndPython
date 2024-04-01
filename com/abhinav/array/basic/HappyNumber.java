package com.abhinav.array.basic;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        HappyNumberSolution hns  = new HappyNumberSolution();
        hns.isHappy(n);
    }
}

class HappyNumberSolution{
    public boolean isHappy(int n) {
        boolean happy = false;
        try {
            int temp  =n;
            int sum = 0;
            while(sum!=1){
                int rem = temp%10;
                sum += Math.pow(rem, 2);
                temp/=10;
                if(temp <= 1 ){
                    sum += Math.pow(temp, 2);
                    temp = sum;
                    if(sum==1){
                        return true;
                    }
                    sum = 0;
                }
            }

            
        } catch (Exception e) {
            return false;
        }

        return happy;
        
    }
}
