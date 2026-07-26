class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        int index = 0;
        for(int i=0;i<prices.length;i++){
            if(min >prices[i]){
                min = prices[i];
                index = i;
            }

        }
        for(int i = index+1;i<prices.length;i++){
            int diff = prices[i] -min;
            profit = Math.max(profit,diff);
        }
        return profit;

    }
}