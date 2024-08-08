package BackTrack;

import java.util.*;

public class permutationsII {
    public static void main(String[] args) {
          int[] nums = {1,1,2} ;
          System.out.println(Arrays.toString(nums));
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        permutationHelper(ans  , nums  , nums.length , 0) ;
        return new ArrayList<>(ans) ;
    }

    private static void permutationHelper( Set<List<Integer>> ans, int[] nums, int n, int index) {
        if (index == n) {
            List<Integer> list = new ArrayList<>() ;
            for (int num :  nums) {
                list.add(num) ;
            }
            ans.add(list);
            return;
        }
        for (int i = index; i < n; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            swap(nums, i, index);
            permutationHelper(ans, nums, n, index +1);
            swap(nums, i, index);

        }
    }

    private static void swap(int[] nums, int first, int second)
    {
        int temp =  nums[first];
        nums[first] = nums[second] ;
        nums[second] = temp ;
    }
}
