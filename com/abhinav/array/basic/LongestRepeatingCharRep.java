package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharRep {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        LongestRepeatingCharRepSolution lrcrs = new LongestRepeatingCharRepSolution();
        System.out.println(lrcrs.characterReplacement(s, k));
    }
}

class LongestRepeatingCharRepSolution{
    public int characterReplacement(String s, int k) {
        int maxCount = 0;
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> countMap = new HashMap<>();
        int maxLength = 0;
        int leftPointer = 0;  
        //AABCABBA
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
            maxCount = Math.max(maxCount,map.get(s.charAt(i)));
            if(leftPointer-i+1-maxCount<k){
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                leftPointer++;
            }
            maxLength = Math.max(maxLength,i-leftPointer+1);
        }
        
        return maxLength; 
    }
}
