package Day1_10.AdvancedArraysAndStrings3;

public class BestTimeToBuySellStock121 {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int left = 0;
        int right = 1;
        int profit = Math.max(0,prices[right]-prices[left]);
        while(right<prices.length){
            if(prices[left]<prices[right]) {
                if (profit < (prices[right] - prices[left]))
                    profit = prices[right] - prices[left];
                right++;
            }
            else {
                left = right++;
            }
        }
        return profit;
    }
}
