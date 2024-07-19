public class JumpGame {
    public static void main(String[] args) {
    int[] nums  = {2,3,1,1,4} ;
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
 int n   = nums.length;
 int res= 0 ;
        for (int i = 0; i <n ; i++) {
            if (i > res) {
                return false ;
            }
            res  = Math.max(res,nums[i]+i) ;
        }
        return true;
    }
}
