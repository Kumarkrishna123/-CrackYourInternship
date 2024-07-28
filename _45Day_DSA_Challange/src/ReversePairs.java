package String;

import java.util.ArrayList;

public class ReversePairs {
    public static void main(String[] args) {
   int[] nums = {1,3,2,3,1} ;
        System.out.println(reversePairs(nums));
    }
    public static int reversePairs(int[] nums) {
        return margeSort(nums , 0 ,nums.length-1) ;
        }

    private static int margeSort(int[] arr, int low, int high) {
int count =0 ;
if (low>=high){
    return count ;
    }
int mid =  (low + high )/2 ;
count += margeSort(arr , low , mid) ;
count +=margeSort(arr , mid+1 , high) ;
count+=countPairs(arr , low,  mid , high) ;
merge(arr , low , mid , high) ;
        return count;
    }

    private static int countPairs(int[] arr, int low, int mid, int high) {
         int count = 0 ;
         int right  = mid+1 ;
        for (int i = low; i <= mid; i++) {
            while (right <= high &&  arr[i] > (2*(long)arr[right])) right++;
            {
                count += (right - (mid + 1));
            }
        }
        return count;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int left =  low ;
        int right = mid+1 ;
        ArrayList<Integer> ans = new ArrayList<>() ;
        while (left<=mid && right <=  high){
            if (arr[left]<= arr[right]) {
                ans.add(arr[left]) ;
                left++ ;

            }else {
                ans.add(arr[right]) ;
                right++ ;
            }
        }
        while (left <=mid){
            ans.add(arr[left]) ;
            left++ ;
        }

        while (right <=high){
            ans.add(arr[right]) ;
            right++ ;
        }
        for (int i = low; i <=high ; i++) {
            arr[i] = ans.get(i-low) ;
        }
    }
}
