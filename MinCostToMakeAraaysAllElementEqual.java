package SortingOrSearching;

public class MinCostToMakeAraaysAllElementEqual
{
    public static void main(String[] args) {
       int[] a = {1,100,101} ;
       int n =3 ;
        System.out.println(minCostToMakeElementEqual(a, n));
    }

//    static int minCostToMakeElementEqual(int[] a , int n){
//        int y = 0 ;
//        if (n %2 !=0) {
//            y =a[n/2] ;
//        }
//        if (n%2==0) {
//            y= (a[n/2] +  a[(n-2)/2]) /2 ;
//        }
//        int sum = 0;
//        for (int i = 0; i <n ; i++) {
//            sum = sum + Math.abs(a[i] - y) ;
//        }
//
//        return sum;
//    }
static int minCostToMakeElementEqual(int[] a , int n){
        int low =a[0] ;
        int high  = a[0] ;
    for (int i = 0; i <n ; i++) {
        if (low >  a[i]) {
            low =a[i] ;
        }
        if (a[i]  > high) {
            high =  a[i] ;
        }
    }
        while (( high- low) > 2 ) {
            int mid1 =  low +  (high-low)/3 ;
            int mid2 =  high  - (high-low) /3 ;

            int cost1 = costTomakeElementEqual(a  , n  , mid1) ;
            int cost2 =  costTomakeElementEqual(a  , n  , mid2);


            if (cost2  > cost1) {
                high =  mid2 ;
            }
            else {
                low = mid1 ;
            }
        }
        return costTomakeElementEqual(a, n , (low + high)/2) ;

}

    private static int costTomakeElementEqual(int[] a, int n, int mid) {

        int cost = 0 ;
        for (int i = 0; i <n ; i++) {
            cost+= Math.abs(a[i] -mid) ;
        }
        return cost ;
    }


}
