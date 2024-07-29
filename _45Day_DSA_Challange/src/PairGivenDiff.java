package SortingOrSearching;

import java.util.HashSet;

public class PairGivenDiff {
    public static void main(String[] args) {
        int n = 5 ;
        int x = 45 ;
        int arr[] = {90, 70, 20, 80, 50}  ;
        System.out.println(findPair( n  , x, arr ));
    }

    public  static int findPair(int n, int x, int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i] - x) || set.contains(arr[i] + x)) return 1;
            set.add(arr[i]);
        }
        return -1;
    }
}
