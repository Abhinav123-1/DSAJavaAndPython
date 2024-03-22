package com.abhinav.array.basic;

public class LargestElement {
    public static void main(String[] args) {
        
    }
    
}

class LargestElementSolution{
    public int largestElement(int arr[], int n){
        int maxElement = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}
