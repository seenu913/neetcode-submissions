class Solution {
    public int maxProfit(int[] prices) {
        
        int prev = 0;
        int next = 1;
        int profit = 0;
        while(next < prices.length){
            if(prices[prev] >= prices[next]) {
                prev = next;
                next++;
            } else {
                profit = Math.max(profit, prices[next]-prices[prev]);
                next++;
            }
        }
        return profit;
    }
}
