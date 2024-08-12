package String;

public class SmallestWindowSubString {
    public static void main(String[] args) {
           String s = "ADOBECODEBANC";
           String t = "ABC" ;
        System.out.println(minWindow(s , t));
    }
    public static String minWindow(String s, String t) {
    int[] arr =  new int[128] ;
        for (char ch  :  t.toCharArray()) {
            arr[ch]++;
        }
        int left = 0 ; int right =0 ; int minLen =  Integer.MAX_VALUE;  int counter = t.length();
          int minStart = 0 ;
        while (right < s.length()){
         char c1 =s.charAt(right) ;
            if (arr[c1] >  0) {
                counter-- ;
            }
            arr[c1]-- ;
          right++;


          while (counter==0){

              if (minLen > right-left) {
                  minLen = right-left ;
                  minStart = left ;
              }
           char c2 = s.charAt(left) ;
              arr[c2]++;
              if (arr[c2] > 0) {
                  counter++;
              }
              left++;

          }

        }
        return  minLen== Integer.MAX_VALUE ?"": s.substring(minStart , minStart+minLen) ;
    }
}
