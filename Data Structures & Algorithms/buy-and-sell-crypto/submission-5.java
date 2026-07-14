class Solution {
    public int maxProfit(int[] prices) {
        int[] vals = new int[prices.length * prices.length];
        int k = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                    vals[k++] = prices[j] - prices[i];
            }
        }

        

        Arrays.sort(vals);

        return vals[vals.length -1 ];
    }
}