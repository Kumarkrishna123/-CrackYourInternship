package DP;

public class MinPathSum {
    public static void main(String[] args) {
        int[][]  grid= {
                {1 , 3 , 1},
                {1 , 5 , 1},
                {4 , 2 , 1},
        } ;
        System.out.println(minPathSum(grid)) ;
    }

     //  this approach is just recursive so  gives T.L.E
//    public static int minPathSum(int[][] grid) {
//        int  m =  grid.length ;
//        int n =  grid[0].length ;
//        return pathSum(grid ,0, 0 , m ,n) ;
//    }
//    private static int pathSum(int[][] grid,int r, int c , int m  , int n) {
//        if (r== m -1&& c==n-1) {
//            return grid[r][c];
//        }
//        if (r>=m || c>=n) {
//            return Integer.MAX_VALUE ;
//        }
//        int right = pathSum(grid ,r, c+1 , m, n) ;
//        int down =  pathSum(grid ,r+1, c , m , n) ;
//        return Math.min(right , down) +  grid[r][c];
//    }

    // using D.p

    public static int minPathSum(int[][] grid) {
        int  m =  grid.length ;
        int n =  grid[0].length ;
        for (int i = 1; i < m; i++) {
            grid[i][0 ] +=grid[i-1][0] ;
        }
        for (int j = 1 ; j < n; j++) {
            grid[0][j] +=grid[0][j-1] ;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i-1][j] ,  grid[i][j-1]) ;
            }
        }
        return grid[m-1][n-1];
    }
}
