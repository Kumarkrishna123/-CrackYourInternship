import javax.swing.plaf.IconUIResource;

public class BuyAndSellStockBestDay1 {
    public static void main(String[] args) {
        int[] prices = { 2,4,1} ;
        System.out.println(maxProfit(prices));
    }
    public  static int maxProfit(int[] prices) {
        int buyMinPriceStock  = Integer.MAX_VALUE ;
           int profit = 0  ;
           int soldAtDay = 0 ;
        for (int i = 0; i < prices.length; i++) {
            if (buyMinPriceStock > prices[i]) {
                buyMinPriceStock = prices[i];
            }
            soldAtDay = prices[i] - buyMinPriceStock;
            if (profit < soldAtDay) {
                profit = soldAtDay;
            }
        }
        return profit ;
    }
}
