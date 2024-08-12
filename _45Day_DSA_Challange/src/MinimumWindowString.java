package String;

public class MinimumWindowString {
    public static void main(String[] args) {
      String  s = "timetopractice";
       String p= "toc" ;
        System.out.println(smallestWindow(s,p));
    }
    public static String smallestWindow(String s, String p)
    {
        //Your code here

        int[] arr =  new int[128] ;
        for (char ch  :  p.toCharArray()) {
            arr[ch]++;
        }
        int left = 0 ; int right =0 ; int minLen =  Integer.MAX_VALUE;  int counter = p.length();
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
        return  minLen== Integer.MAX_VALUE ?"-1": s.substring(minStart , minStart+minLen) ;

    }
}
