package String;

import java.util.Arrays;
import java.util.Map;

public class LongestCommonString {
    public static void main(String[] args) {
       String[] strs = {"flower" ,"flow","flight"} ;
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans =  new StringBuilder() ;
        Arrays.sort(strs) ;
        String first = strs[0] ;
        String second =  strs[strs.length-1];

        for (int i = 0; i < Math.min(first.length() , second.length()); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i)) ;
        }

        return ans.toString();
    }
}
