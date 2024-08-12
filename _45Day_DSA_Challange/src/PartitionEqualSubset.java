package DP;

import java.util.Arrays;

public class PartitionEqualSubset {
    public static void main(String[] args) {
       int N =3 ;
       int[] arr = {2,4,9} ;
        System.out.println(equalPartition(N , arr));
    }
    static int equalPartition(int N, int[] arr) {
           int max  = 0 ;
        for (int i = 0; i < arr.length; i++) {
            max +=arr[i];
        }
        if (max %2!=0) {
            return 0 ;
        }
        boolean isSubset =helpera( max/2 , arr)  ;
        return isSubset?1:0 ;
    }

    private static boolean helpera(int sum, int[] arr) {
        int[] dp =  new int[sum+1] ;
        Arrays.fill(dp , 0) ;
        dp[0] =1 ;

        for (int i = 0; i < arr.length; i++) {
            for (int j = sum; j >=arr[i] ; j--) {
                if (dp[j-arr[i]] == 1) {
                    dp[j]= 1 ;
                }
            }

        }

        if (dp[sum] == 1) return true;
        return false ;
    }
}


