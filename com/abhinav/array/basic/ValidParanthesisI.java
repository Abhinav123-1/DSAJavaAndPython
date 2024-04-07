package com.abhinav.array.basic;

import java.util.Stack;

public class ValidParanthesisI {
    public static void main(String[] args) {
        String s = "()[]{}";
        ValidParanthesisISolution vpis = new ValidParanthesisISolution();
        vpis.isValid(s);
        
    }
}

class ValidParanthesisISolution{
    public boolean isValid(String s) {
        Stack<Character> validStack = new Stack<>();
        for(int i= 0; i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[' ){
                validStack.push(s.charAt(i));
            }
            else if(validStack.empty()) {
                 return false;
            }
            else if((s.charAt(i)=='}' && validStack.peek() =='{') ||(s.charAt(i)==')' && validStack.peek() =='(')||(s.charAt(i)==']' && validStack.peek() =='[') ){
                validStack.pop();
            }else{
                return false;
            }

        }
        if (validStack.size()==0) return true;
        return false;
    }
        
}
