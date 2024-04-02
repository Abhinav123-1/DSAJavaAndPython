package com.abhinav.array.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t = "aaabbbba";
        IsomorphicStringSolution iss =new IsomorphicStringSolution();
        System.out.println(iss.isIsomorphic(s, t));

    }
}

class IsomorphicStringSolution{
    public boolean isIsomorphic(String s, String t) {
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();
        Map<Character,Character> charMap= new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            s1.add(s.charAt(i));
            s2.add(t.charAt(i));
            if(charMap.containsKey(s.charAt(i))){
                Character c = charMap.get(s.charAt(i));
                if(c!=t.charAt(i)){
                    return false;
                }
            }
            charMap.put(s.charAt(i), t.charAt(i));

        }
        if(s1.size()!=s2.size()){
            return false;
        }
        return true;

    }
}
