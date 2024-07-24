package String;

import java.util.Arrays;
import java.util.HashMap;

public class PrintAllDuplicatesInString {
    public static void main(String[] args) {
   String str =  "geeksforgeeks" ;
     printDups(str);
    }
    static  void printDups(String str)
    {
        int len =  str.length();
        char[] ch   =  str.toCharArray() ;
        Arrays.sort(ch);
        String sortedString = new String(ch) ;
        for (int i = 0; i <len ; i++) {
            int count = 1 ;
            while ( i < len -1 && sortedString.charAt(i) ==sortedString.charAt(i+1)){
                i++ ;count++ ;
            }
            System.out.println(sortedString.charAt(i) + " , count ="  +count);
        }
    }
}
