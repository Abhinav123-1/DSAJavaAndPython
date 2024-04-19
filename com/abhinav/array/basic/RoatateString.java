package com.abhinav.array.basic;

public class RoatateString {
    public static void main(String[] args) {
        
    }
}

class RoatateStringSolution{
    public boolean rotateString(String s, String goal) {
        String s1 = s+s;
        if(s.length() == goal.length() && s1.contains(goal)){
            return true;
        }
        return false;

    }
}
