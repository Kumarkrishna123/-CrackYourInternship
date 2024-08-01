package SortingOrSearching;

import java.util.Arrays;

public class SmallestPostiveMissing {
    public static void main(String[] args) {
        int[] arr = {1,0} ;
        System.out.println(missingNumber(arr,2));
    }
    static int missingNumber(int arr[], int size) {

        int positiveNum = 1;
        Arrays.sort(arr) ;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                if (arr[i] > positiveNum) {
                   return positiveNum;
                } else if (arr[i] == positiveNum) {
                     positiveNum++;
                } else if (arr[i] < positiveNum) {
                    continue;
                }
            }
        }
        return positiveNum;
    }
}
