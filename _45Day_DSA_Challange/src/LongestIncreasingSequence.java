package DP;

import java.util.Arrays;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
    int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int maxiumsofar =1 ;
        if (nums.length == 1) return 1;
        int[] lis= new int[nums.length] ;
        Arrays.fill(lis , 1) ;
        for (int i = nums.length-1; i >=0 ; i--) {
            for (int j = i+1; j < nums.length ; j++) {

                if (nums[i] < nums[j]) {
                    lis[i] =  Math.max(lis[i] ,  lis[j]+1) ;
                }
            }
            maxiumsofar = Math.max(maxiumsofar , lis[i]) ;
        }
        return maxiumsofar;
    }
}
