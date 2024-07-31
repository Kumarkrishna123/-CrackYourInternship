package SortingOrSearching;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[]arr = {170, 45,75,90 ,802,24,2,66} ;
        int n = arr.length ;
       radixSort(arr,n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    static  void radixSort(int[]  arr  , int n){
        int max =  getMax(arr, n) ;
        for (int exp = 1;max/ exp > 0 ; exp++) {
            countSort(arr , n , exp) ;
        }
    }

    private static void countSort(int[] arr, int n, int exp) {


        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    private static int getMax(int[] arr, int n) {
        int max =0 ;
        for (int i = 1; i < n; i++) {
            if (arr[i]>max) {
                max  = arr[i] ;
            }
        }
        return max;
    }
}
