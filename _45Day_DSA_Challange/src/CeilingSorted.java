package SortingOrSearching;

public class CeilingSorted {
    public static void main(String[] args) {
  int[] arr = {1, 2, 8, 10, 10, 12, 19} ;
        System.out.println(ceiling(arr , 0 , arr.length-1,5  ));
    }
  // ceiling of x is the smallest element in an array greater than or equal to x ;
    static int ceiling(int[] arr ,int s, int e , int x ){
        if (arr[e] < x){
            return -1 ;
        }

            int mid =( s+e) /2 ;
        if (arr[mid] == x) {
            return mid ;
        }

           else if (arr[mid]  < x ) {
                if (arr[mid+1] >= x && mid +1 <= e  ) {
                     return mid +1 ;
                }
                else {
                    return ceiling(arr , mid+1 , e , x) ;
                }
            }
            else {
                if (arr[mid-1] < x && mid -1 >= s  ) {
                   return  mid ;                }
                else {
                    return ceiling(arr , s, mid-1 , x) ;
                }
            }

    }
}
