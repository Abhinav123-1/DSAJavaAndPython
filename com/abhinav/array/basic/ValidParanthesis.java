package com.abhinav.array.basic;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "(*))";
        ValidParanthesisSolution vps = new ValidParanthesisSolution();
        System.out.println(vps.checkValidString(s));
        
    }
}

class ValidParanthesisSolution{
    public boolean checkValidString(String s) {
        Stack<Character> validStack = new Stack<>();
        int countOpen = 0;
        int countClsoed = 0;
        int countStar = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                validStack.push('(');
            }else if(s.charAt(i) == ')'){
                validStack.pop();
            }else{
                countStar++;
            }
        }
        if (validStack.size() == 0) return true;
        for(int i=0;i<validStack.size();i++){
            if(validStack.get(i)=='('){
                countOpen++; 
            }else if(validStack.get(i)==')'){
                countClsoed++;
            }
        }
        if(countOpen==0 && countClsoed == countStar){
            return true;
        }else if(countClsoed ==0 && countOpen == countStar){
            return true;
        }else if(countClsoed==0 && countOpen==0 && countStar>0){
            return true;
        }
        return false;
    }
}
