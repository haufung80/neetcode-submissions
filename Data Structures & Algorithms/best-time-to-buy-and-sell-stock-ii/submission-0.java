class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int curr = prices[0];
        int currProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] > prices[i]) {
                maxProfit += currProfit;
                curr = prices[i];
            } else {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}