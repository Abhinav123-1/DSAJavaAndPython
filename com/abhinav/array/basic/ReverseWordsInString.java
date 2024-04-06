package com.abhinav.array.basic;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "a good   example";
        ReverseWordsInStringSolution rwiss = new ReverseWordsInStringSolution();
        System.out.println(rwiss.reverseWords(s));
    }
}

class ReverseWordsInStringSolution {
    public String reverseWords(String s) {
        String[] words = s.trim().replaceAll(" +", " ").split(" ");
        StringBuilder reverse = new StringBuilder(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i] + " ");
        }
        return reverse.toString().trim();
    }
}
