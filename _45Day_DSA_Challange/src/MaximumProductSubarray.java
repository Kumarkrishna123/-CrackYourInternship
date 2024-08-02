package DP;

public class MaximumProductSubarray {
    public static void main(String[] args) {
         int[]  nums = {2,3,-2,4} ;
        System.out.println(maxProduct(nums) );
    }
    public static int maxProduct(int[] nums) {
      int n = nums.length;
     int max = nums[0] ;
     int min = nums[0] ;
     int ans = nums[0];
        for (int i =1; i < n ; i++) {
            if (nums[i]  < 0) {
                int temp = max ;
                max = min ;
                min = temp ;

            }


            max=  Math.max(nums[i], max* nums[i] ) ;
            min =  Math.max(nums[i] , min*nums[i]) ;
            ans = Math.max(ans , max) ;

        }

        return ans ;
    }
}
