package com.PostFixtoInfix;
import java.util.Stack ;
public class postfixtoinfix {
    public  static  String PostToInfix(String exp) {
        Stack<String>stack = new Stack<>() ;

        for ( char  ch : exp.toCharArray() ) {
            if(Character.isLetterOrDigit(ch)) {
                stack.push(ch+"") ;
            }else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String operand = '(' + op2 + ch + op1 + ')';
                stack.push(operand);
            }
        }
        return stack.pop() ;
    }

    public static void main(String[] args) {
        String exp = "ab+de*/" ;
        System.out.println("post expresion " + exp );
        System.out.println("infix expresion " + PostToInfix(exp));
    }
}
