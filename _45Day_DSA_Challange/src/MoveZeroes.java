import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
       int[] nums ={0} ;
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
    public  static void moveZeroes(int[] nums) {
//        if (nums.length == 1) {
//          return ;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 1; j < nums.length ; j++) {
//                if (nums[i] == 0 && j>i && nums[j]!=0) {
//                    int temp  =  nums[i];
//                    nums[i] =  nums[j];
//                    nums[j] =   temp;
//                }
//            }
//        }

        // better approaches  - O(N)
  int x = 0 ;
  int arr[] =  new int[nums.length] ;
        for (int val : nums) {
            if (val != 0) {
                arr[x++] = val ;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i]  =  arr[i] ;
        }
        for (int i = x; i < nums.length; i++) {
            nums[i] =0 ;
        }


    }



}
