package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrintAnagramTogether {

    public List<List<String>> Anagrams(String[] string_list) {

        HashMap<String , List<String>> map =  new HashMap<>() ;
        for (String s : string_list){
            String  newS =  generate(s) ;
            if ( !map.containsKey(newS)) {
                map.put(newS , new ArrayList<>()) ;
            }
            map.get(newS ) .add(s) ;
        }
        return new ArrayList<>(map.values()) ;
    }

    private static String generate(String s) {
        int[] count = new int[26]  ;
        for (char ch :  s.toCharArray()) {
            count[ch-'a'] ++ ;
        }
        StringBuilder sb= new StringBuilder() ;
        for (int i = 0; i <26 ; i++) {
            if (count[i] >0){
                sb.append(String.valueOf((char) (i+'a')).repeat(count[i]));
            }
        }

        return sb.toString();


    }
}
