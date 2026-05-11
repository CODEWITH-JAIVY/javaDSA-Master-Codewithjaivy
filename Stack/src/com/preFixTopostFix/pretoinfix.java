package com.preFixTopostFix;

import java.util.Stack;

public class pretoinfix {
    public  static  String  PrefixToinfix(String exp ) {
        Stack<String> stack = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
//
            if(Character.isLetterOrDigit(exp.charAt(i))) {
                stack.push(exp.charAt(i)+"") ;
            }else {
                // Operator → must have at least 2 operands
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid Prefix Expression");
                }

                String op1 =stack.pop() ;
                String op2 = stack.pop() ;
                String subexpresion= "("+op1+exp.charAt(i) +op2+")" ;
                stack.push(subexpresion) ;
            }

        }
        return  stack.pop() ;
    }
    public static void main(String[] args) {
        String exp ="-*+abc/de" ;
        System.out.println("Prefix Operation " + exp );
        System.out.println("Infix operation " + PrefixToinfix(exp));
    }
}
