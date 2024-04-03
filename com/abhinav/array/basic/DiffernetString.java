package com.abhinav.array.basic;

public class DiffernetString {
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        DiffernetStringSolution dss = new DiffernetStringSolution();
        System.out.println(dss.findTheDifference(s, t));

    }
}

class DiffernetStringSolution {
    public char findTheDifference(String s, String t) {
        int sum = 0;

        for (char c : t.toCharArray()) {
            sum += c;
        }

        for (char c : s.toCharArray()) {
            sum -= c;
        }

        return (char) sum;
    }

}
