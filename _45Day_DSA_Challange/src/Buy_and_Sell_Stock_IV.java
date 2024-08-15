package DP;

import java.util.HashMap;

public class Buy_and_Sell_Stock_IV {
    public static void main(String[] args) {
         int k  =  2 ;
         int[] prices = {3,2,6,5,0,3} ;
        System.out.println(maxProfit(k , prices));
    }

    public static int maxProfit(int k, int[] prices) {
        if (k ==  0  &&  prices.length < 2) {
          return 0 ;
        }
      int[][]  transection = new int[k][2] ;
        for (int i = 0; i < k; i++){
            transection[i][0] =  Integer.MAX_VALUE ;}
        for (int price : prices) {
            for (int i = 0; i < k; i++) {
                int prevProfit = 0;
                if (i > 0)
                    prevProfit = transection[i - 1][1];

                transection[i][0] = Math.min(transection[i][0], price - prevProfit);
                transection[i][1] = Math.max(transection[i][1], price - transection[i][0]);
            }
        }

        return transection[k-1][1];
    }

}
