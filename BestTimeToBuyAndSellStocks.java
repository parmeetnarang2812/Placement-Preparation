/* class Solution {
    public int maxProfit(int[] prices) {
        // initially
        int minPrice = prices[0];
        int maxProfit = 0;
        
        // traverse the array
        for(int price : prices) {
            // calc. min price
            if(price < minPrice){
                minPrice = price;
            }  
            // calc. max profit
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
        return maxProfit;
    }
}                                       
 */