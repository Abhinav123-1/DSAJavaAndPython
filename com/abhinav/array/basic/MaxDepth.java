package com.abhinav.array.basic;

public class MaxDepth {
    public static void main(String[] args) {
        
    }
}

class MaxDepthSolution{
    public int maxDepth(String s) {
        ///"(1+(2*3)+((8)/4))+1"
        int leftCounter = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='('){
                leftCounter++;
                max = Math.max(max,leftCounter);
            }else if(s.charAt(i) == ')'){
                leftCounter-- ;
            }
        }    
        return max;    
    }
}