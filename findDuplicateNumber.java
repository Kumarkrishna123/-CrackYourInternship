public class findDuplicateNumber {
    public static void main(String[] args) {
 int[] nums =  {1,2,3,2,4} ;
        System.out.println(findDuplicate(nums));
    }
    public static   int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int index = nums[i] - 1;
                if (nums[i] != nums[index]) {
                    swap(nums, i, index);
                } else {
                    return nums[i] ;
                }
            }else {
                i++ ;
            }

        }
        return -1 ;
    }
    static void swap(int[] arr, int first ,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}