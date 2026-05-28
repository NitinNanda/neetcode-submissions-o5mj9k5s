class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
        return maxProfit;

        // int maxP = 0, l = 0, r = 1;
        // while(r < prices.length) {
        //     if(prices[l] < prices[r]){
        //         int profit = prices[r] - prices[l];
        //         maxP = Math.max(maxP, profit);    
        //     } else{
        //         l = r;
        //     }
        //     r++;
        // }
        // return maxP;
    }
}
