// Last updated: 8/2/2025, 10:46:24 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0, minStock = Integer.MAX_VALUE;
        int i = 0;
        while (i < n) {
            minStock = Math.min(minStock, prices[i]);
         
            if (prices[i] >= minStock)
                maxProfit = Math.max(maxProfit, prices[i] - minStock);
            i++;
        }
        return maxProfit;
    }
}