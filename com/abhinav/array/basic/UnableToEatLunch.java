package com.abhinav.array.basic;

import java.util.Deque;
import java.util.LinkedList;
public class UnableToEatLunch {
    public static void main(String[] args) {
        int [] students = {1,1,1,0,0,1};
        int [] sandwiches = {1,0,0,0,1,1};
        UnableToEatLunchSolution utels = new UnableToEatLunchSolution();
        System.out.println(utels.countStudents(students, sandwiches));

    }

}

class UnableToEatLunchSolution{
    public int countStudents(int[] students, int[] sandwiches) {
        //1,1,0,0
        //0,1,0,1
       Deque<Integer> queue =  new LinkedList<>();
       int low = 0;
       int count =0;
       for(int i=0;i<students.length;i++){
        queue.add(students[i]);
       }
       while(queue.size()>0 && count!=queue.size()){
        if(queue.peek() == sandwiches[low]){
            low++;
            count = 0;
            queue.pop();
        }else{
            queue.addLast(queue.pop());
            count++;
        }
       }
        return queue.size();
    }
}