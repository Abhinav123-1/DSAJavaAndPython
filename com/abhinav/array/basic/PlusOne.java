package com.abhinav.array.basic;

public class PlusOne {
    public static void main(String[] args) {
       int [] digits = {9};
       PlusOneSolution pos = new PlusOneSolution();
       pos.plusOne(digits); 
    }
}

class PlusOneSolution{
    public int[] plusOne(int[] digits) {
        int[] plusOneDigits = new int[digits.length+1];
        int sum = 0;
        boolean size = false;
        for(int i=digits.length-1;i>=0;i--){
            sum += digits[i] * Math.pow(10,digits.length-i-1);
        }
         sum+=1;
         int j = digits.length-1;
         int temp = sum;
         if(digits[digits.length-1] == 9){
            size = true;
            j = plusOneDigits.length-1;
         }
        while(j>=0){
            int rem = sum%10;
            if(size){
                plusOneDigits[j] = rem;  
            }else{
                digits[j] = rem;
            }

            j--;
            sum/=10;
        }
        return size?plusOneDigits:digits;
        
    }
}
