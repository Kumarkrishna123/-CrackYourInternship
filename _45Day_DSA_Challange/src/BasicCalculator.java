package String;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String s = "3+5/2";
        System.out.println(calculate(s));
    }
//    public static int calculate(String s) {
//        char operator = '+' ;
//             int num = 0;
//             int last = 0 , sum = 0 ;
//        for (int i = 0; i <s.length() ; i++) {
//            char c = s.charAt(i) ;
//            if (Character.isDigit(c) ) {
//                num = num * 10 + (c-'0' );
//            }
//            if (isOperator(c) || i== s.length()-1) {
//                if (operator=='+') {
//                  sum = sum+last ;
//                  last  = num ;
//                }
//                else if (operator== '-') {
//                    sum+=last ;
//                    last = -num ;
//                }
//                else if (operator == '*'){
//                    last*=num ;
//                }
//                else if (operator == '/'){
//                    last/=num ;
//                }
//                num =0 ;
//                operator = c;
//            }
//        }
//
//        return sum+=last;
//    }

    public static int calculate(String s) {
        char operator = '+';
        int num = 0;
        Stack<Integer> stack = new Stack<>() ;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if(isOperator(c) || i== s.length()-1){
                if (operator == '+') {
                    stack.push(num) ;
                } else if (operator == '-') {
                    stack.push(-num) ;
                }

                else if (operator == '*') {
                   stack.push(stack.pop() * num);
                }

                else if (operator == '/') {
                    stack.push(stack.pop() / num);
                }

            }
            num =0 ;
            operator = c;

        }
        int ans =0 ;
        while (!stack.isEmpty()){
            ans+=stack.pop() ;
        }


        return ans;
    }

    private static boolean isOperator ( char c){
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
