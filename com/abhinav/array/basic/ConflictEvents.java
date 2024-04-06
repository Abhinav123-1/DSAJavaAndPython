package com.abhinav.array.basic;

public class ConflictEvents {
    public static void main(String[] args) {
        
    }
}

class ConflictEventsSolution{
    public boolean haveConflict(String[] event1, String[] event2) {
        
        boolean event1EndsBeforeEvent2Starts = 
        event1[1].compareTo(event2[0]) < 0;
        boolean event1StartsAfterEvent2Ends 
        = event1[0].compareTo(event2[1]) > 0;
        return!event1EndsBeforeEvent2Starts &&
         !event1StartsAfterEvent2Ends;
    }
}