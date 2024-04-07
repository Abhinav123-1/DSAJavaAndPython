package com.abhinav.array.basic;


public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "()";
        ValidParanthesisSolution vps = new ValidParanthesisSolution();
        System.out.println(vps.checkValidString(s));
        
    }
}

class ValidParanthesisSolution{
    public boolean checkValidString(String s) {
        int balance = 0; 
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            char currentChar = s.charAt(i);
            if (currentChar != ')') {
                ++balance;
            } else if (balance > 0) {
                --balance;
            } else {
                return false;
            }
        }   
        balance = 0; 
        for (int i = n - 1; i >= 0; --i) {
            char currentChar = s.charAt(i);
            if (currentChar != '(') {
                ++balance;
            } else if (balance > 0) {
                --balance;
            } else {
                return false;
            }
        }
        return true;
    }
}
