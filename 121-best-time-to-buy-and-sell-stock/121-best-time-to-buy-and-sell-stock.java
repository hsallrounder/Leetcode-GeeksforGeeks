class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0,min=prices[0];
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            maxp=Math.max(maxp,prices[i]-min);
        }
        return maxp;
    }

}