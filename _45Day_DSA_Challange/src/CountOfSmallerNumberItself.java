package SortingOrSearching;

import java.util.ArrayList;
import java.util.Collections;

public class CountOfSmallerNumberItself {
    public static void main(String[] args) {
      int[] nums = {5,2,6,1} ;
        System.out.println(countSmaller(nums));
    }

    public static ArrayList<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();


        for (int num : nums) {
            arr.add(num);
        }
        Collections.sort(arr);

        for (int i = 0; i < nums.length; i++) {
            int index = bs(arr, nums[i]);
            ans.add(index);
            arr.remove(index);
        }

        return ans;
    }

    private  static int bs(ArrayList<Integer> arr, int num) {

        int start = 0;
        int end = arr.size() - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            int x = arr.get(mid);

            if (x < num) {
                start = mid + 1;
            } else if (x > num) {
                end = mid - 1;
            } else {
                if (mid == 0) {
                    return mid;
                } else if (x == arr.get(mid - 1)) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
