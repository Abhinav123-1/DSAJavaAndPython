package com.abhinav.array.basic;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RevelaCards {
    public static void main(String[] args) {
        
    }
}
class RevelaCardsSolution{
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> deque = new ArrayDeque<>();      
        Arrays.sort(deck);
        int deckLength = deck.length;   
        for (int i = deckLength - 1; i >= 0; --i) {
            if (!deque.isEmpty()) {
                deque.offerFirst(deque.pollLast());
            }
            deque.offerFirst(deck[i]);
        }
        int[] result = new int[deckLength];
        for (int i = deckLength - 1; i >= 0; --i) {
            result[i] = deque.pollLast();
        }
        return result;
    }
}
