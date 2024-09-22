class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        
        int buy_price = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            if(buy_price > prices[i]){
                buy_price = prices[i];
            }
                
            else{
                int current_price = prices[i] - buy_price;
                profit = Math.max(current_price, profit);
            }
                  
        }
        
        return profit;
        
    }
}