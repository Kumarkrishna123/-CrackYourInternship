package DP;

import java.util.Arrays;

public class MaximizeTheCutSegment {
    public static void main(String[] args) {
     int n =4 ; int  x  = 2 ; int y =1 ; int z  = 1 ;
        System.out.println(maximizeCuts(n  , x,  y , z));

    }

    public static int maximizeCuts(int n, int x, int y, int z)
    {
        int[] dp  = new int[n+1] ;
        Arrays.fill(dp , -1);
        return solver(n, x, y ,z ,dp)< 0? 0 :  dp[n] ;
    }

    private static int solver(int n, int x, int y, int z, int[] dp) {

        if (n ==  0 ) {
            return 0 ;
        }
        if (n <0) {
            return  Integer.MIN_VALUE ;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int a  =  1+ solver(n-x , x, y, z , dp) ;
        int b  = 1+ solver(n-y , x, y , z , dp) ;
        int c  = 1+ solver(n-z , x, y ,z, dp) ;

        int ans  =  Math.max(a, Math.max(b,c)) ;
        dp[n] =  ans ;

        return dp[n];
    }

}
