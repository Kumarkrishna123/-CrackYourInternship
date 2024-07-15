import java.util.Arrays;

public class RemoveDuplicagtesFromArray {
    public int removeDuplicates(int[] nums) {
        int k = nums.length; ;
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != Integer.MAX_VALUE ) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        nums[j] = Integer.MAX_VALUE;
                        k = k - 1;
                    }
                }
            }
        }
        Arrays.sort(nums);
        return k;

    }
}
