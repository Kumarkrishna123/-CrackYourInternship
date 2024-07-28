package SortingOrSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PermuteTwoArraytoGetSumEqualK {
    public static void main(String[] args) {
        Integer a[] = {2, 1, 3};
        int b[] = {7, 8, 9};
        int k = 10;
        System.out.println(isPossible(a, b, k));
    }

    static boolean isPossible(Integer[] a, int[] b, int k) {
        int n = a.length;
        Arrays.sort(a, Collections.reverseOrder()); // sort  in decreasing order
        Arrays.sort(b); // sort increasing order
        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }
        return true;
    }
}
