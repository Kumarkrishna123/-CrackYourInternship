package BackTrack;

import java.util.ArrayList;
import java.util.List;

public class SubsetI {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer  = new ArrayList<>() ;
        outer.add(new ArrayList<>()) ;
        for (int num : nums) {
            int n = outer.size() ;
            for (int i = 0; i <n ; i++) {
                List<Integer> internal  =  new ArrayList<>(outer.get(i)) ;
                internal.add(num) ;
                outer.add(internal) ;
            }
        }

        return outer;
    }
}
