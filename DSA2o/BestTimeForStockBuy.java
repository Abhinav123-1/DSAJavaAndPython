package DSA2o;

public class BestTimeForStockBuy {
    public static void main(String[] args) {
        
    }
}

class BestTimeForStockBuySolution{
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int price = 0;
        for(int i=0; i<prices.length;i++){
            int profit = prices[i] - prices[price];
            if(profit>0){
                maxProfit = Math.max(maxProfit, profit);
            }else{
                price = i;
            }
        }

        return maxProfit;

    }
}
