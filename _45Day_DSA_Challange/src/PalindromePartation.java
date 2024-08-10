package DP;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartation {
    public static void main(String[] args) {
          String s = "aab" ;
        System.out.println(partition(s));
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans  = new ArrayList<>() ;

        if (s.equals("") ) {
            ans.add(new ArrayList<>());
            return ans ;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s, i+1) ) {
                for (List<String> list : partition(s.substring( i+1)) ) {
                    list.add(0 ,s.substring(0 , i+1)) ;
                    ans.add(list) ;
                }
            }
        }
        return ans;
    }
    private static boolean isPalindrome(String s, int n) {
        for (int j = 0; j < n/2; j++) {
            if (s.charAt(j) != s.charAt(n-j-1)) {
                return false ;
            }
        }
        return true;
    }
}
