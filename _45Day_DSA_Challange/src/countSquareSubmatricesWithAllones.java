package DP;

import java.util.Arrays;

public class countSquareSubmatricesWithAllones {
    public static void main(String[] args) {
     int[][] matrix  =  {{0, 1, 1, 1},
             {1, 1, 1, 1},
             {0, 1, 1, 1}} ;
        System.out.println(countSquares(matrix));
    }
        //  best is dp/memo  top down aproahces
    public static int countSquares(int[][] matrix) {
   int m = matrix.length ; int n =  matrix[0].length ;
   int[][] dp  =  new int[m+1][n+1] ;
   for (int[] row : dp){
       Arrays.fill(row ,-1);
   }

   int ans  =  0 ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    ans +=solver(matrix , m , n  , i , j , dp) ;}}}

        return ans;
    }

    private static int solver(int[][] matrix, int m, int n, int i, int j , int[][]dp) {
        if ( i<0|| i>=m || j<0 || j>= n ||matrix[i][j] == 0 ) {
              return  0 ;
        }
        if (dp[i][j] != -1) {
            return dp[i][j] ;
        }

        int right =  solver(matrix  , m , n  , i , j+1 , dp) ;
        int bottom  =  solver(matrix , m ,n , i+1 , j , dp) ;
        int bottmright  = solver(matrix , m , n , i+1  , j+1 , dp)  ;


        return   dp[i][j] = 1+ Math.min(Math.min(right , bottom) , bottmright);
    }
}
