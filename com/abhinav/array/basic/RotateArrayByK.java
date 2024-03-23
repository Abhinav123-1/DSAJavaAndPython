package com.abhinav.array.basic;

import java.util.LinkedList;

public class RotateArrayByK {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        RotateArrayByKSolution rabks = new RotateArrayByKSolution();
        rabks.rotate(nums, 3);
    }
    
}

class RotateArrayByKSolution{
    public void rotate(int[] arr, int k) {
        LinkedList<Integer> ll = new LinkedList<>();
        for(int num: arr){
            ll.offer(num); //this uses queue
        }
        for(int i=0;i<arr.length;i++){
            arr[(i+k)%arr.length] = ll.poll();
        }
    
       

       
   }
}
