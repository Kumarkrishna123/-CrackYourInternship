package DP;

import java.util.Arrays;

public class MaximulSquare {
    public static void main(String[] args) {
        char[][] matrix = {
                {'0', '1', '1', '0'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '1', '0', '0'}
        };
        System.out.println(maximalSquare(matrix));
    }
    public static int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix[0].length < 1 ) {
            return 0 ;
        }
      int m  = matrix.length ; int  n  = matrix[0].length ;
      int[][] dp   = new int[m+1] [n+1];
        for (int[] row :  dp) {
            Arrays.fill(row ,0) ;
        }
         int maxArea = 0 ;
        for (int  r= 0;  r<m ; r++) {
            for (int c = 0;  c <n ; c++) {
                if (matrix[r][c] == '1') {
                    dp[r+1][c+1] =  1+ Math.min(Math.min(dp[r][c] , dp[r+1][c])  ,  dp[r][c+1]) ;
                       maxArea =  Math.max(maxArea , dp[r+1][c+1]) ;
                }
            }

        }
        return maxArea*maxArea;
    }
}
