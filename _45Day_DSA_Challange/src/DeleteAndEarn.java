package DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DeleteAndEarn {
    public static void main(String[] args) {
         int[] nums = {2,2,3,3,3,4} ;
        System.out.println(deleteAndEarn(nums));
    }
    public static int deleteAndEarn(int[] nums) {
        int n= 10001 ;
        int[] house = new int[n] ;
        for (int num :  nums) {
            house[num ] += num ;
        }
        return Delete(house);
    }

    private static int Delete(int[] nums) {
        int[] dp  = new int[nums.length] ;
        Arrays.fill(dp , -1);
        return earn(dp , 0 , nums);

    }

    private static int earn(int[] dp, int indx, int[] nums) {
        if (indx >= nums.length) {
             return 0 ;
        }
        if (dp[indx]!= -1) {
            return dp[indx] ;
        }

        return dp[indx] = Math.max(earn(dp , indx+2 , nums) + nums[indx] , earn(dp , indx+1 , nums)) ;

    }

}
