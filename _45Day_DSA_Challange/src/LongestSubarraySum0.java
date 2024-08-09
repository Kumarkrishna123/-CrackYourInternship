package Heap;

import java.util.HashMap;

public class LongestSubarraySum0 {
    public static void main(String[] args) {
          int[] arr  = {15,-2,2,-8,1,7,10,23} ;
          int n =8 ;
        System.out.println(maxLen(arr ,n));
    }
    static int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> map  = new HashMap<>() ;
        int maxLen = 0 ;
        int sum = 0 ;
        for (int i = 0; i < n; i++) {
                 sum = sum + arr[i]  ;
                if (sum == 0) {
                    maxLen = 1 +i ;
            }
                Integer prev_i = map.get(sum)  ;
            if (prev_i !=  null) {
                maxLen =  Math.max(maxLen , i-prev_i) ;
            }
            else {
                map.put(sum , i ) ;
            }
        }
        return maxLen;
    }

}
