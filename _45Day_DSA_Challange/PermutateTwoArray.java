package SortingOrSearching;

import java.util.Arrays;

public class PermutateTwoArray {
    public static void main(String[] args) {
        int[] a ={1,2,3} ;
        int[] b = {7,8,9} ;
        int n =3 ;
        int  k =10 ;
        System.out.println(sum(a, b, n ,k));
    }
    static boolean sum(int[] a , int[] b , int n  ,int k ){
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if (a[i] +b[n-1-i]  < k) {
                return false ;

            }
        }

        return true;
    }
}
