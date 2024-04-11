package com.abhinav.array.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ShortestDistanceToCharacter {
    public static void main(String[] args) {
        String s = "aaba";
        char c = 'b';
        ShortestDistanceToCharacterSolution sdtcs = new ShortestDistanceToCharacterSolution();
        System.out.println(sdtcs.shortestToChar(s, c));
        //loveleetcode
        // e
    }
}

class ShortestDistanceToCharacterSolution{
    public int[] shortestToChar(String s, char c) {
        //loveleetcode
        // e
        //[3,2,1,0,1,0,0,1,2,2,1,0]
        int[] charList = new int[s.length()];
        int high = 0;
        int low = 0;
        int oldLow = -1000;
        while(low<s.length() && high<=s.length()){

            if(high<=s.length() || s.charAt(high) == c){
                while(low<=high){
                    charList[low] = Math.min(Math.abs(high-low),Math.abs(low - oldLow)+1);
                    low++;
                }
                oldLow = low;
                high++;
            }else{
                high++;
            }
        }
        return charList;  
        
    }
}
