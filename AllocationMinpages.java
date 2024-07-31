package SortingOrSearching;

public class AllocationMinpages {
    public static void main(String[] args) {
     int[] arr = {12,34,67,90} ;
     int n = arr.length;
     int m = 2 ;
        System.out.println(findPages( n,arr, m));
    }
    public static long findPages(int n, int[] arr, int m) {
        int start =0 ;
        int end =0 ;
        for (int i = 0; i < n; i++) {
            start=Math.max(start , arr[i]) ;
            end += arr[i];
        }
        if (m  > n) {
            return -1 ;
        }
        //  binary search
        while (start<end) {
            int mid = start + (end-start)/2 ;
            int sum =0 ;
            int pieces =1 ;
            for (int num : arr) {
                if (sum +num  > mid) {
                    sum = num ;
                    pieces++;
                }else {
                    sum+=num ;
                }
            }
            if (pieces  > m) {
                start = mid+1 ;
            }
            else {
                end = mid;
            }
        }


        return end;
    }
}
