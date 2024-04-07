package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.Map;


public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        WordPatternSolution wps =  new WordPatternSolution();
        System.out.println(wps.wordPattern(pattern, s));
        
    }
}
class WordPatternSolution{
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> stringCharMap = new HashMap<>();
        Map<String,Character> charStringMap = new HashMap<>();

        String[] splitText = s.split(" ");
        if(splitText.length != pattern.length()){
            return false;
        }
        for(int i=0;i<splitText.length;i++){
            if(stringCharMap.containsKey(pattern.charAt(i))){
                String val  = stringCharMap.get(pattern.charAt(i));
                if(!val.equals(splitText[i])){
                    return false;
                }
            }
            stringCharMap.put(pattern.charAt(i), splitText[i]);  
        }
        for(int i=0;i<splitText.length;i++){
            if(charStringMap.containsKey(splitText[i])){
                Character val  = charStringMap.get(splitText[i]);
                if(!val.equals(pattern.charAt(i))){
                    return false;
                }  
            }
            charStringMap.put( splitText[i],pattern.charAt(i));  
        }
        return true;
        
    }
}
