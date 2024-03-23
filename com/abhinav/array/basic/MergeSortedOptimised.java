package com.abhinav.array.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergeSortedOptimised {
    public static void main(String[] args) {
        int []a = {1, 1, 2, 3, 5, 5, 5, 10, 10 };
        int []b = {2, 4, 7, 10, 10 };
        MergeSortedArrayOptimisedSolution msas = new MergeSortedArrayOptimisedSolution();
        System.out.println(msas.sortedArray(a, b));
        
    } 
}
class MergeSortedArrayOptimisedSolution{
    public  List< Integer > sortedArray(int []a, int []b) {
        List<Integer> combinedList = new ArrayList<>();
        Set<Integer> combinedSet = new TreeSet<>();
        for(int num: a){
            combinedSet.add(num);
        }
        for(int num: b){
            combinedSet.add(num);
        }
        combinedList.addAll(combinedSet);
        
        
        return combinedList;

    }
}
