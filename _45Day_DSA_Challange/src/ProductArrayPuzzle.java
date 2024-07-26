package Mathematical;

import java.util.Arrays;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
    int nums[] = {10,3,5,6,2} ;
        System.out.println(Arrays.toString(productExceptSelf(nums, 5)));
    }
    public static long[] productExceptSelf(int nums[], int n)
    {

        long[] p =  new long[n] ;
        long prd = 1 ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if (i == j) {
                    continue;
                }
                else {
                    prd =  prd *nums[j] ;
                }
            }
              p[i] = prd ;
              prd = 1 ;
        }

        return p;
    }
}
