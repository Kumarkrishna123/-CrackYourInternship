public class BesTimeToSellAndBuyStock2 {
    public static void main(String[] args) {
 int[] price ={7,1,5,3,6,4} ;
        System.out.println(maxProfit(price));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0 ;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                  profit =  profit + (prices[i] - prices[i-1]) ;
            }
        }
        return profit;
    }

}
