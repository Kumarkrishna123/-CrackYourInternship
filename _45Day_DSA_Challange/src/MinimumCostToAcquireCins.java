package Greedy;

import java.sql.Array;
import java.util.Arrays;

public class MinimumCostToAcquireCins {
    public static void main(String[] args) {
        int[] coins = { 8, 5, 3, 10, 2, 1, 15, 25 };
        System.out.println(minCost(coins, coins.length , 3));

    }
    public static int  minCost (int[] coins , int n , int k){

        Arrays.sort(coins);
        int coinsNeed = (int) Math.ceil(1.0* n /(k+1));
        int ans =0 ;
        for (int i = 0; i <= coinsNeed-1 ; i++) {
            ans+=coins[i] ;
        }

        return ans;
    }
}
