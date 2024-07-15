public class SortColour {

        public void sortColors(int[] nums) {
            boolean swapped; // if the array is already sorted so it will return direct after one check or at
            // the end of lsat two check of array it will return answer ;
            for (int i = 0; i < nums.length; i++) {
                swapped = false;
                for (int j = 1; j < nums.length - i; j++) {
                    if (nums[j] < nums[j - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j - 1];
                        nums[j - 1] = temp;
                        swapped = true;
                    }
                }
            }

    }
}
