package BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
      int n = 4 ; int k = 2  ;
        System.out.println(combine(n,k));
    }


    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs =  new ArrayList<>();
        combine(combs , new ArrayList<>() , 1 ,  n  , k);
        return combs ;
    }

    public static void combine(List<List<Integer>> combs, ArrayList<Integer> comb, int start, int n, int k) {
        if(k==0){
            combs.add(new ArrayList<>(comb)) ;
            return  ;
        }
        for (int i = start; i <=n ; i++) {
            comb.add(i) ;
            combine(combs ,comb , i+1 , n ,k-1) ;
            comb.remove(comb.size()-1) ;
        }

    }
}
