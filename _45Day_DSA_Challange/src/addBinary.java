public class addBinary {
    public static void main(String[] args) {
        String a = "11" ;
        String b = "1" ;
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {

        StringBuilder sb =  new StringBuilder() ;
        int i = a.length() -1 ;
        int j =  b.length()-1 ;
        int carry = 0 ;
        while (i>=0 || j>=0){
            int sum =  carry ;
            if (i >=0) {sum = sum + (a.charAt(i--)  - '0') ;}
            if (j >=0){ sum = sum + (b.charAt(j--)  - '0') ;}
            carry =  sum>1 ? 1 : 0 ;
            sb.append(sum %2) ;
        }
        if (carry != 0) {
            sb.append(carry) ;
        }
        return sb.reverse().toString() ;
    }
}
