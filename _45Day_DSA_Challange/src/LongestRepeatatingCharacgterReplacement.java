package SlidingWindowTwoPointer;

public class LongestRepeatatingCharacgterReplacement {
    public static void main(String[] args) {
      String  s = "ABAB" ;
                int k = 2 ;
        System.out.println(characterReplacement(s , k ));
    }

    public  static  int characterReplacement(String s, int k) {
         int[]  arr =   new int[26] ;
         int res = 0 ;
         int max= 0 ;


         int l= 0  ;

        for (int r = 0; r < s.length() ; r++) {
            arr[s.charAt(r) - 'A']++ ;

            max=  Math.max(max , arr[s.charAt(r) -'A']) ;

            if (r -l +1-max > k) {
                arr[s.charAt(l)- 'A']-- ;
                l++ ;
            }
            res = Math.max(res , r- l +1) ;
        }
        for(int i = 0; i < 26; i++){
            if(res < arr[i]){
                res = arr[i];
            }
        }
        return res;
    }

}

