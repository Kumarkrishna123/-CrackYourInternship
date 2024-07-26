package Mathematical;

import java.util.Arrays;

public class MinimumMoves {
    public static void main(String[] args) {
        int[] nums = { 1,2 ,10,9} ;
        System.out.println(minMoves2(nums));
    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int Moves =0 ;
        int mid =nums[nums.length/2];
        for (int  num :  nums){
          Moves +=  Math.abs(mid -  num) ;
        }
        return Moves;
    }
}
