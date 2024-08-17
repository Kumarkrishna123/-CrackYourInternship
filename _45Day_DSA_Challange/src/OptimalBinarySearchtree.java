package BackTrack;

import java.util.Arrays;

public class OptimalBinarySearchtree {
    public static void main(String[] args) {
        int keys[] = { 10, 12, 20 };
        int freq[] = { 34, 8, 50 };
        int n = keys.length ;
        for (int i = 0; i < n; i++)
            Arrays.fill(cost[i], 0);

        for (int i = 0; i < n; i++)
            cost[i][i] = freq[i];
        System.out.println(optimalBinarySearchTree(keys,freq, n));
    }
    static int[][] cost  =  new int[1000][1000];
    static int optimalBinarySearchTree(int[] keys , int[] freq ,int n){

        Arrays.sort(keys);
        return solver(freq , 0 , n-1) ;
    }

    private static int solver(int[] freq, int i, int j) {

        if (i<0 || j<0) {
            return 0;
        }
        if (cost[i][j] !=0) {
            return cost[i][j] ;
        }
        int fsum =  sum(freq ,i ,  j) ;
        int min =  Integer.MAX_VALUE ;
        for (int k = i; k <=j ; k++)  {
       int c = solver(freq , i , k-1 )  + solver(freq , k+1 ,j ) +  fsum ;
            if (min >  c) {
              min=c ;
                cost[i][j] = c ;
            }

        }


        return cost[i][j];
    }

    private static int sum(int[] freq, int i, int j) {
         int ans =0 ;
        for (int k = i; k <=j ; k++) {
              ans+=freq[k] ;
        }
        return ans;
    }
}
