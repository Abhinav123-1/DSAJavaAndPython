package com.abhinav.array.basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 10;
        PalindromeNumberSolution pns = new PalindromeNumberSolution();
        System.out.println(pns.isPalindrome(x));
    }
}

class PalindromeNumberSolution{
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String revString = "";
        for(int i=s.length()-1;i>=0;i--){
            revString+=s.charAt(i);
        }
        if(s.equals(revString)){
            return true;
        }
        return false;
    }
}
