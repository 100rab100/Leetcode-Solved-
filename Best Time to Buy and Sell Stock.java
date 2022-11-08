class Solution {
    public int maxProfit(int[] prices) {
        
        int minprice = prices[0] ;
        int maxprofit = 0;
        for(int i = 0; i<prices.length ; i++)
        {
           minprice=Math.min(minprice,prices[i]);
           int profit =prices[i]-minprice;
           maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}
