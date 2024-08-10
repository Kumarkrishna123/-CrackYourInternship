package DP;

public class LongestCommonSubstring {
    public static void main(String[] args) {
          String s1 = "ABCDGH" ;
          String s2 = "ACDGHR" ;
        System.out.println(longestCommonSubstring(s1, s2));
    }

    public static int longestCommonSubstring(String s1, String s2) {
        int n = s1.length() ;
        int m =  s2.length() ;

       int[][]  dp = new int[n+1][m+1]  ;
        for (int i = 0; i <=n ; i++) {dp[i][0] = 0 ;
        }
        for (int i = 0; i <=m; i++) {dp[0][i] = 0 ;}
        int ans = 0 ;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                 dp[i][j] = 1+ dp[i-1][j-1] ;
                }
                else {
                    dp[i][j] =0 ;
                }
                ans  = Math.max(dp[i][j] , ans) ;
            }
        }

        return ans;
    }
}
