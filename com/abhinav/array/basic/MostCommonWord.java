package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph="a, a, a, a, b,b,b,c, c";
        String []banned = {"a"};
        MostCommonWordSolution mcws = new MostCommonWordSolution();
        System.out.println(mcws.mostCommonWord(paragraph, banned));
        
    }
}

class MostCommonWordSolution{
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
       // paragraph =  paragraph.replaceAll("[^\\sa-zA-Z0-9]", "");
        String[] splitText = paragraph.split("\\W+");
        Map<String,Integer> map  =new HashMap<>();
        int maxValue = 0;
        String s ="";
        for(String str: splitText){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        for(String str: banned){
            if(map.containsKey(str)){
                map.remove(str);
            }
        }
        for(Entry<String,Integer>entry:map.entrySet()){
            maxValue = Math.max(maxValue,(int)entry.getValue());
            if(maxValue == (int)entry.getValue()){
                s = (String) entry.getKey();
            }   
        }
        return s;
    }
}