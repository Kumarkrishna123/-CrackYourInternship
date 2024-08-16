package Matrix;

public class MaximumAreaOfRectangle {
    public static void main(String[] args) {
            int[][] M = {
                    { 0, 1, 1, 0 },
                    { 1, 1, 1, 1 },
                    { 1, 1, 1, 1 },
                    { 1, 1, 0, 0 },
            } ;
        System.out.println(maxArea(M ,M[0].length ,M.length));
    }
    public static int maxArea(int M[][], int n, int m) {
        if (M.length <= 0) {
            return  0 ;
        }
        int maxArea =0 ;
        int[][] dp  = new int[n][ m] ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0) {
                    dp[i][j] = M[i][j] ==1?1:0;
                }
                else{
                    dp[i][j] = M[i][j] ==1 ? (dp[i-1][j] +1) : 0 ;
                }
                int min  = dp[i][j] ;
                for (int k = j; k >= 0; k--) {
                    if (min == 0) break;
                    if (min >dp[i][k]) {
                        min= dp[i][k] ;
                    }
                 maxArea =Math.max(maxArea , min *  (j-k+1)) ;
                }

            }
        }
        return maxArea;
    }
}
