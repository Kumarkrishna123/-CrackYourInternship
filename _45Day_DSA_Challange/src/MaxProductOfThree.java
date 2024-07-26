package Mathematical;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
   int[] nums = {1,2,3,4 ,6};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        int max1  = nums[0] *  nums[1] * nums[2];
        int max2 =  nums[n-1] *  nums[n-2] * nums[n-3] ;
        return Math.max(max2, max1) ;
    }
}
