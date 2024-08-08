package Greedy;

import com.sun.source.tree.BreakTree;

public class GasStation {
    public static void main(String[] args) {
      int[]  gas = {1,2,3,4,5} ;
      int[] cost = {3,4,5,1,2} ;
        System.out.println(canCompleteCircuit(gas ,cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
          int n = gas.length ;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] < cost[i]) {
                continue;
            }
            int j = (i+1) %n ; // gola ghumne  ke liye
           int  currGas = gas[i] -  cost[i] +gas[j] ;
           while(j!=i){
               if (currGas < cost[j]) {
                   break;
               }
               int costForMovingFromThisj = cost[j] ;
                j = (j+1)%n ;
                int gasInNextStationj = gas[j] ;
               currGas =  currGas - costForMovingFromThisj  + gasInNextStationj ;
           }
            if (j == i) {
                return i ;
            }
        }
        return -1;
    }


    // greedyAppraoches ;
    public static int canCompleteCircuit2(int[] gas, int[] cost) {
        int n = gas.length;
        int totalKamai =0 ;
        int totalKharch =0 ;
        for (int i = 0; i < n; i++) {
             totalKamai =   totalKamai  + gas[i] ;
        }
        for (int i = 0; i < cost.length; i++) {
           totalKharch = totalKharch + cost[i] ;
        }
        if (totalKharch  > totalKamai) {
            return -1 ;
        }
        int result = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += gas[i] -cost[i];
            if (total  < 0) {
                result  = i+1;
                total = 0 ;
            }
        }
        return result ;
    }



}
