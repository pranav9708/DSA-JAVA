// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

class Solution {
    // Bruteforce
    // public int maxProfit(int[] prices) {
    //     int maxProfit=0;
    //     for(int buy=0;buy<prices.length;buy++){
    //         for(int sell=buy+1;sell<prices.length;sell++){
    //             int profit=prices[sell]-prices[buy];
    //             maxProfit=Math.max(maxProfit,profit);
    //         }
    //     }

    //     return maxProfit;
    // }



    // Using space
    // public int maxProfit(int[] prices) {
    //     int maxProfit=0;
    //     int futureMax[]=new int[prices.length];
    //     futureMax[prices.length-1]=prices[prices.length-1];

    //     for(int i=prices.length-2;i>=0;i--){
    //         if(prices[i]>futureMax[i+1]){
    //             futureMax[i]=prices[i];
    //         }else{
    //             futureMax[i]=futureMax[i+1];
    //         }
    //     }

    //     for(int i=0;i<prices.length;i++){
    //         int profit=futureMax[i]-prices[i];
    //         if(maxProfit<profit){
    //             maxProfit=profit;
    //         }
    //     }

    //     return maxProfit;
    // }


    //Best Approach
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minSoFar=prices[0];
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-minSoFar;
            if(prices[i]<minSoFar){
                minSoFar=prices[i];
            }

            if(profit>maxProfit){
                maxProfit=profit;
            }
            
        }

        return maxProfit;
    }
}