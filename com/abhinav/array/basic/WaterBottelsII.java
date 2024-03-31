package com.abhinav;

public class WaterBottelsII {
    public static void main(String[] args) {
        WaterBottelsIISolution wbsiis = new WaterBottelsIISolution();
        System.out.println(wbsiis.maxBottlesDrunk(19, 12));
        
    }
}

class WaterBottelsIISolution{
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int maxBottels = 0;
        maxBottels+=numBottles;
        int toExchange = numBottles;
        numBottles = 0;
        while (toExchange>1) {
            toExchange = toExchange - numExchange;
            numExchange++;
            numBottles++;
        }
        maxBottels+=numBottles;
        return maxBottels;
    }
}
