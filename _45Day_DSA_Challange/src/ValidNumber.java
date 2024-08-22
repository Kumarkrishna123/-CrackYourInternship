package String;

public class ValidNumber {
    public static void main(String[] args) {
        String s = "e" ;
        System.out.println(isNumber(s));
    }
    public static boolean isNumber(String s) {
       s = s.trim() ;
       boolean num = false  , exp = false , sign= false , dec =  false ;
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if (c >= '0' && c<='9') num =  true ;
            else if (c=='e' || c=='E') {
                if (exp || !num) {
                    return false;
                } else {
                    exp = true;
                    sign = false;
                    num = false;
                    dec = false;
                }
            }
                else if (c ==  '+' ||  c=='-') {
                    if (sign|| num || dec ) return false ;
                    else sign =  true ;
                    }

                else if (c=='.') {
                if (dec|| exp) {
                    return false ;
                }
                else  {
                    dec =  true  ;
            }
        }
              else {
                  return false ;
            }

        }
        return num;
    }
}
