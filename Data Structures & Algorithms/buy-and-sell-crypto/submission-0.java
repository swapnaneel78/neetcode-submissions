class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            int diff=prices[i]-buy;
            maximum=Math.max(diff,maximum);
        }
        return maximum;
    }
}
