package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Textjustification {
    public static void main(String[] args) {
        String[] words ={"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16 ;
        System.out.println(fullJustify(words , maxWidth));
    }
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lines  =  new ArrayList<String>();
        int index= 0;
        while (index  < words.length){
            int count = words[index].length() ;
             int last =  index+1 ;
             while (last < words.length){
                 if (words[last].length() +  count +1 >  maxWidth) {
                   break;
                 }
                 count+=words[last].length()+1 ;
                 last ++ ;
             }

              StringBuilder  builder = new StringBuilder() ;
             int diff = last - index -1 ;
            if (last == words.length ||  diff ==0) {
                for (int i = index; i <last; i++) {
                    builder.append(words[i] +" ") ;
                }
                builder.deleteCharAt(builder.length() -1) ;
                for (int i = builder.length(); i < maxWidth; i++) {
                    builder.append(" ");
                }
            }
            else {
                int spaces =  (maxWidth - count) / diff ;
                int r = (maxWidth - count) % diff ;
                for (int i = index; i <last ; i++) {
                    builder.append(words[i])  ;
                    if (i < last-1) {

                        for (int j = 0; j <= (spaces+ ((i - index) < r ?1:0)); j++) {
                            builder.append(" ");
                        }
                    }
                }
            }
            lines.add(builder.toString()) ;
            index  = last ;
        }


        return lines;
    }
}
