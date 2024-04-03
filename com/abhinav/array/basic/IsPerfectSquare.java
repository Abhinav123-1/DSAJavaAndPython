package com.abhinav.array.basic;

public class IsPerfectSquare {
    public static void main(String[] args) {
        
    }
}

class IsPerfectSquareSolution{
    public boolean isPerfectSquare(int num) {
        int range = (num/2)-1;
        for(int i=0;i<=range;i++){
            if(i*i == num){
                return true;
            }
        }
        return false;
        
    }
}
