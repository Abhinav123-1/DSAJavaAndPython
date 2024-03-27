package com.abhinav.array.basic;

public class SubStringInString {
    public static void main(String[] args) {

    }
}

class SubStringInStringSolution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
