package com.abhinav.array.basic;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int []a = {1, 1, 2, 3, 5, 5, 5, 10, 10 };
        int []b = {2, 4, 7, 10, 10 };
        MergeSortedArraySolution msas = new MergeSortedArraySolution();
        System.out.println(msas.sortedArray(a, b));
        
    }
}

class MergeSortedArraySolution{
    public  List< Integer > sortedArray(int []a, int []b) {
        List<Integer> combinedList = new ArrayList<>();
        int ptr1=0;
        int ptr2=0;
        int  m = a.length;
        int n = b.length;

        while (ptr1<m && ptr2<n) {
            if(a[ptr1] == b[ptr2]){
                if(!combinedList.contains(b[ptr2])){
                combinedList.add(a[ptr1]);
                }
                ptr1++;
                ptr2++;
            }
            else if(a[ptr1]>b[ptr2]){
                if(!combinedList.contains(b[ptr2])){
                combinedList.add(b[ptr2]);
                }
                ptr2++;
            }else{
                if(!combinedList.contains(a[ptr1])){
                combinedList.add(a[ptr1]);
                }
                ptr1++;
            }
        }
        while(ptr1<m){
            if(!combinedList.contains(a[ptr1])){
            combinedList.add(a[ptr1]);
        }
        ptr1++;

    }
        while(ptr2<n){
            if(!combinedList.contains(b[ptr2])){
            combinedList.add(b[ptr2]);
        }
        ptr2++;

    }

        return combinedList;

    }
}
