package com.abhinav.array.basic;

public class WaterBottelsII {
    public static void main(String[] args) {
        WaterBottelsIISolution wbsiis = new WaterBottelsIISolution();
        System.out.println(wbsiis.maxBottlesDrunk(17, 3));
        
    }
}

class WaterBottelsIISolution{
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        if(numBottles < numExchange){
            return numBottles;
        }
        int sum = numBottles;
            while(numBottles >= numExchange){
                int rem  = numBottles / numExchange;
                sum+=rem;
                int rest  = numBottles % numExchange;
                numBottles = rem+rest;
            }
        return sum;
    }
}
