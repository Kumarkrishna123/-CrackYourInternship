package String;

import java.util.Arrays;
import java.util.Stack;

public class simplyfyPath {
    public static void main(String[] args) {
      String path    = "/home/user/Documents/../Pictures" ;
        System.out.println(simplifyPath(path));
    }
    public static  String simplifyPath(String path) {

        Stack<String> st = new Stack<>() ;
        String[] directories =  path.split("/") ;
        for (String str :  directories ){
            if (str.equals("." )|| str.isEmpty()) {
                continue;
            } else if (str.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop() ;
                }
            }
             else {
                st.push(str) ;
            }
        }
        return "/" + String.join("/", st) ;
    }

}

