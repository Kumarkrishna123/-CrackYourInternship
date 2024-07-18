import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class chocolateDistribution {
    public static void main(String[] args) {
    int
    }
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
//        int minDiff =  Integer.MAX_VALUE ;
//
//        for (int i = m-1; i < a.size(); i++) {
//            minDiff =  Math.min((a.get(i) - a.get(i-m+1)) , minDiff ) ;
//        }
//
//        return minDiff;

        int start = 0 ; int end= 0 ;
        int minDiff = Integer.MAX_VALUE ;
        for (int i = 0; i+m-1 < n ; i++) {
             int diff =  a.get(i+m-1) - a.get(i) ;
            if (minDiff > diff) {
                minDiff  = diff ;
                start =  i ;
                end =  i+m-1 ;
            }
        }
        return a.get(end) - a.get(start);
    }


}
