package SortingOrSearching;

import java.util.Arrays;

public class CheckReversingASubarrayIs {
    public static void main(String[] args) {
         int[] arr = {1,2,5,3,4} ;
         int n = args.length;
        System.out.println(reverseSubArray(arr, n));
    }
    static boolean reverseSubArray(int[]arr , int n  ){
        int[] temp = new int[n] ;
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);

         int s ;
        for (s = 0; s <n ; s++) {
            if (temp[s] != arr[s]) {
                break;
            }
        }
        int e ;
        for ( e = n-1; e >=0 ; e--) {
            if (temp[e] != arr[e]) {
                break;
            }
        }

        if (s >= e) {
            return true ;
        }
    // subarray sort ;
   do{
       s++ ;
       if (arr[s-1] < arr[s]) {
           return false ;
       }
   }while (s!=e) ;

        return true;
    }
}
