package DP;

public class OnesAndZeros {
    public static void main(String[] args) {
        String[] strs = {"10","0001","111001","1","0"} ;
        System.out.println(findMaxForm(strs , 4, 3));
    }

    public static int findMaxForm(String[] strs, int m, int n) {


        int[][] dp  = new int[m+1] [n+1] ;

        for (String s : strs) {
            int ones = findOnes(s);
            int zeroes = s.length() - ones;

            for (int i = m; i >=zeroes ; i--) {
                for (int j =n; j >=ones ; j--) {
                    dp[i][j] =  Math.max(dp[i][j] , dp[i-ones][j-zeroes] +1) ;

                }
            }
        }
        return dp[m][n];
//        return helper(strs , m , n , 0) ;
    }

//    private static int helper(String[] strs, int m, int n, int indx) {
//        if ( indx == strs.length || (m == 0 && n==0)) {
//            return 0;
//        }
//        if (m<0 || n <0) {
//            return 0 ;
//        }
//
//        int maxLen =helper(strs , m ,n , indx+1) ;
//        int len = 0 ;
//
//            String  s = strs[indx];
//            int ones = findOnes(s) ;
//            int zeroes =  s.length()-ones ;
//
//        if (m>=zeroes && n >=ones) {
//            len  =  1 + helper(strs , m-ones , n-zeroes , indx+1) ;
//
//        }
//             maxLen =  Math.max(maxLen , len) ;
//
//        return maxLen;

//    }

    private static int findOnes(String s) {
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
