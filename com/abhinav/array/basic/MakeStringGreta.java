package com.abhinav.array.basic;


import java.util.LinkedList;
import java.util.Stack;

public class MakeStringGreta {
    public static void main(String[] args) {
        String s = "leEeetcode";
        MakeStringGretaSolution msgs = new MakeStringGretaSolution();
        System.out.println(msgs.makeGood(s));

    }
}

class MakeStringGretaSolution {
    public String makeGood(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(!list.isEmpty()){
                if(Math.abs(list.getLast() - arr[i]) == 'a' - 'A'){
                    list.removeLast();
                    continue;
                }
            }
            if(i + 1 != n && Math.abs(arr[i + 1] - arr[i]) == 'a' - 'A') i++;
            else list.add(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        while(!list.isEmpty()){
            sb.append(list.removeFirst());
        }
        return sb.toString();

    }
}
