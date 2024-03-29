package com.abhinav.array.basic;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetCode";
        FirstUniqueCharacterSolution fucs = new FirstUniqueCharacterSolution();
        System.out.println(fucs.firstUniqChar(s));
        
    }
}

class FirstUniqueCharacterSolution{
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length();i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
     

       
      
        
    }
}