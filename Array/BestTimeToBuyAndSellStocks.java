

public class BestTimeToBuyAndSellStocks {       //Bruteforce Method

    public static void maxProfit(int[] prices)
    {
        int maxProfit = 0;

        int buyDay = 0;
        int sellDay = 0;

        for(int k = 1; k < prices.length; k++)  //Dynamic sliding window
        {
            for(int i = 0; i+k < prices.length; i++)
            {
                int profit = prices[i+k] - prices[i];

                if(profit > maxProfit)
                {
                    maxProfit = profit;
                    buyDay = i + 1;
                    sellDay = i + k + 1;
                }
            }
        }
        System.out.println("Profit : " + maxProfit);
        System.out.println("Buy at Day : " + buyDay + "; Sell at day: " + sellDay);
    }
    
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        maxProfit(prices);
    }
}
