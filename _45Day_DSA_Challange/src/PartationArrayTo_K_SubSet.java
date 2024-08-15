package BackTrack;

import java.util.Arrays;

public class PartationArrayTo_K_SubSet {
    public static void main(String[] args) {
        int[] a = {4 ,3 ,2 ,3 ,5, 2, 1} ;
        System.out.println(isKPartitionPossible(a , 7 ,5));
    }
    public static boolean isKPartitionPossible(int[] arr, int n, int k)
    {
        int max  = 0 ;
        for (int i = 0; i < arr.length; i++) {
            max +=arr[i];}
        if (max %k !=0) {
            return false ;}
        int[] subset =  new int[k] ;
        return helpera(  arr ,n-1, subset ,  max/k) ;
    }
    private static boolean helpera( int[] arr , int index , int[] subset , int  sum) {
        int num  =  arr[index] ;
        if (index < 0) {
              return true ;}
        for (int i = 0; i < subset.length; i++) {
            if (subset[i] + num <= sum) {
                subset[i] += num;
                if (helpera(arr, index - 1, subset, sum)) {
                    return true;
                }
            subset[i] -= num;
             }
        }
        return false;
    }
}
