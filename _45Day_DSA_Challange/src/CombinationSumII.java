package BackTrack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
       int[] candidates = {10,1,2,7,6,1,5} ;
       int target  = 8 ;
        System.out.println(combinationSum2(candidates ,target));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans =  new ArrayList<>();
        Arrays.sort(candidates);
        combine(ans , new ArrayList<>() , candidates , target , 0);
        return ans ;
    }

    private static void combine(List<List<Integer>> ans, ArrayList<Integer> list,int[] candidates, int target , int start) {
        if (target < 0) {
            return;
        }
     if(target == 0){
         ans.add(new ArrayList<>(list)) ;
         return;
     }
      else   {
            for (int i = start; i < candidates.length; i++) {
                if (i  > start && candidates[i] == candidates[i-1]) {
                    continue;
                }
                list.add(candidates[i]);
                combine(ans, list, candidates ,target - candidates[i] , i +1);
                list.remove(list.size() - 1);
            }
        }

    }
}
