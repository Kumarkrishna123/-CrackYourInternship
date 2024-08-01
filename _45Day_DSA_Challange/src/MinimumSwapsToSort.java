package SortingOrSearching;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsToSort {
    public static void main(String[] args) {
         int[]nums = {10,19,6,3,5} ;
        System.out.println(minSwaps(nums));
    }

    public  static int minSwaps(int nums[]) {
        int  n = nums.length;
        int[] a =  new int[n] ;

        HashMap<Integer , Integer> map = new HashMap<>() ;
        for (int i = 0; i < n; i++) {
            a[i] =  nums[i] ;
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            map.put(a[i],i) ;
        }
        int count =0 ;
        for (int i = 0 ; i<n ; i++) {
            while (map.get(nums[i])!= i) {
                count++;
                swap(nums ,map.get(nums[i]) ,i);
            }
        }
        return count ;
    }

    private static void swap(int[] nums, int start, int end) {
        int temp =  nums[start];
        nums[start] =  nums[end];
        nums[end] =   temp;
    }


}
