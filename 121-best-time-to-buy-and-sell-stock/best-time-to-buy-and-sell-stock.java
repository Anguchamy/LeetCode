class Solution {
    public int maxProfit(int[] prices) {
        int sell = Integer.MIN_VALUE;
        int buy = Integer.MAX_VALUE;

        for(int price : prices) {
            buy = Math.min(price, buy);
            sell = Math.max(sell, price - buy);
        }

        return sell;
    }
}