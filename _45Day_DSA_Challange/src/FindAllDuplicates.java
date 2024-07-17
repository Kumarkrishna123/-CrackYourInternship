import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        int i =0 ;
        while (i< nums.length){
            int corectIndex =  nums[i]-1;
            if (nums[i] != nums[corectIndex]) {
                swap(nums,i,corectIndex );
            }else {
                i++;
            }
        }
        List<Integer> arr =  new ArrayList<>() ;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index +1) {
                arr.add(nums[index]);
            }
        }
        return arr;
    }


    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }

}
