class Solution {
    public int maxProfit(int[] prices) {

        int mini = prices[0];
        int maxprofit = 0 ;
        for(int i=1 ; i<prices.length; i++){
            int cost = prices[i]- mini;
            maxprofit = Math.max(maxprofit , cost);
            mini= Math.min(mini,prices[i]);
        }

        return maxprofit;
        
    }
}