package DP;

import java.util.ArrayList;

public class FindAllPossiblePalindromePartation {
    public static void main(String[] args) {
                String S = "geeks" ;
        System.out.println(allPalindromicPerms(S));
    }
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {

        ArrayList<ArrayList<String>> ans  = new ArrayList<>() ;

        if (S.equals("") ) {
           ans.add(new ArrayList<>());
           return ans ;
        }
        for (int i = 0; i < S.length(); i++) {
            if (isPalindrome(S, i+1) ) {
                for (ArrayList<String> list : allPalindromicPerms(S.substring( i+1)) ) {
                      list.add(0 ,S.substring(0 , i+1)) ;
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
