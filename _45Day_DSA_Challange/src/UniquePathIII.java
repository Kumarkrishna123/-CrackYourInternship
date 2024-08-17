package BackTrack;

public class UniquePathIII {
    public static void main(String[] args) {
    int[][] grid  = {
            {1,0,0,0},
            {0,0,0,0},
            {0,0,2,-1}
    } ;
        System.out.println(uniquePathsIII(grid));
    }

    public  static int uniquePathsIII(int[][] grid) {

        int n  = grid.length ;
        int m  = grid[0].length ;
       int count=0 , xpos =0 , ypos= 0 ;
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] ==  0) {
                    count++ ;
                }
                else if (grid[i][j] == 1) {
                    xpos  = i ;
                    ypos = j ;
                }
            }
        }
        return helper(grid , xpos , ypos , n ,m , count);
    }

    private static int helper(int[][] grid, int i, int j, int n, int m, int count) {
        if (i<0  || i>=n || j<0 || j>=m || grid[i][j] ==-1) {
            return  0 ;
        }

        if (grid[i][j] == 2) return count ==-1 ? 1: 0;
        grid[i][j] =-1;
        count-- ;

        int top  =helper(grid , i-1 , j ,n , m  , count) ;
        int down =helper(grid , i+1 , j ,n , m  , count) ;
        int right = helper(grid , i , j+1 ,n , m  , count) ;
        int left = helper(grid , i , j-1 ,n , m  , count);

        grid[i][j] =0 ;

     return top +  down +  left  +  right ;
    }

}
