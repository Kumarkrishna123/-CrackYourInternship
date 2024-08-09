package Heap;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class UglyNumber {
    public static void main(String[] args) {
        int n = 10 ;
        System.out.println(nthUglyNumber(n));
    }
    public static int nthUglyNumber(int n) {
        int[] nums = new int[n] ;
        nums[0] =1 ;
        int i =0 , j =0 , k =0 , p=1  ;

        while ( p< n) {
            int min  =  Math.min(nums[i]*2 ,Math.min(nums[j]*3 , nums[k]* 5)) ;
            nums[p] =  min ;
            if (  nums[p]== nums[i]*2) {
                i++;
            }if (  nums[p]== nums[j]*3) {
                j++;
            }if (  nums[p]== nums[k]*5) {
                k++;}
            p++;
        }
        return nums[n-1];
    }
}
