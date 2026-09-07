class Solution {
    public int maxProfit(int[] prices) {
        int small = prices[0], ans = 0, profit = 0;
        for (int i = 0; i < prices.length; i++){
            small = Math.min(small, prices[i]);
            profit = prices[i] - small;
            ans = Math.max(ans, profit);
        }
        return ans;
    }
}