package com.abhinav.array.basic;

public class TimeToBuyTickets {
    public static void main(String[] args) {
        
    }
}

class TimeToBuyTicketsSolution{
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timeTaken = 0;
        int ticketsToBuy = tickets[k];
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k)
                timeTaken += Math.min(ticketsToBuy, tickets[i]);
            else
                timeTaken += Math.min(ticketsToBuy - 1, tickets[i]);
        }
        return timeTaken;
        
    }
}
