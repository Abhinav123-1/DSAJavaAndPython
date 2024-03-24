package com.abhinav.array.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SuperiorElement {
    public static void main(String[] args) {
        int a[] = {5,4,3};
        SuperiorElementSolution ses = new SuperiorElementSolution();
        System.out.println(ses.superiorElements(a));
        
    }
}

class SuperiorElementSolution{
    public  List< Integer > superiorElements(int []a) {
        //1 2 3 4 9 8 7 6 5 
      List<Integer> superiorElemetList = new ArrayList<>();
      int  highestPt = 0;
        while(highestPt<a.length-1){
            int madMax = Integer.MIN_VALUE;
            for(int i = highestPt == 0 ? highestPt : highestPt+1  ; i<a.length;i++){
                madMax  = Math.max(madMax,a[i]);
                if(madMax<=a[i]){
                    highestPt = i;
                }
            }
            highestPt+=1;
            superiorElemetList.add(madMax); 
        }    
         Collections.sort(superiorElemetList);
        return superiorElemetList ;
    }
}
