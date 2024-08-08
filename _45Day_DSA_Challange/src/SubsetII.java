package BackTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    public static void main(String[] args) {

        int[] nums  = {1,2,2} ;
        System.out.println(subsetsWithDup(nums));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer  = new ArrayList<>() ;
        outer.add(new ArrayList<>()) ;
        int start =0 ;
        int end = 0 ;

        for (int i =0 ; i < nums.length ; i++) {
            start =0 ;
            int n = outer.size() ;
            if (i>0 && nums[i] == nums[i-1]) {
                start =  end +1 ;
            }
            end = outer.size()-1 ;
            for (int j = start; j <n ; j++) {
                List<Integer> internal  =  new ArrayList<>(outer.get(j)) ;
                internal.add(nums[i]) ;
                outer.add(internal) ;
            }
        }

        return outer;

}
