package com.evaluationOfPrefix;
import java.util.Stack;

public class evaluationForMulti {
    private static  int Evalutionmul (String exp) throws IllegalAccessException {
        Stack<Integer>stack = new Stack<>() ;
        char[] chararr = exp.toCharArray() ;
        for (int i = chararr.length-1; i >=0 ; i--) {
            if(chararr[i] == ' ') {
                continue;
            }else  if ( isOperator(chararr[i] )) {
                int num1 = stack.pop() ;
                int num2  = stack.pop() ;
                int newnum = compute( num1 , num2 ,chararr[i] ) ;
                stack.push(newnum) ;
            } else  if( Character.isDigit(chararr[i])) {
                StringBuilder sb = new StringBuilder();
                while (i >= 0 && chararr[i] != ' ' && Character.isDigit(chararr[i])) {
                    sb.insert(0, chararr[i]);
                    i--;
                }
                i++; // adjust because outer for will also decrement
                stack.push(Integer.parseInt(sb.toString()));
            }else {
                throw new IllegalAccessException(chararr[i] + "Operator is not valid ")  ;
            }
        }
        return stack.pop() ;
    }

    private static boolean isOperator(char c) {
        if(c == '+' || c== '-' || c=='*' ||c=='/'){
            return  true  ;
        }
        return  false  ;
    }
    private  static  int compute( int num1 ,int  num2 ,char ch   ) {
        switch (ch){
            case '+' : return  num1+ num2 ;
            case '-' : return  num1 -num2  ;
            case '*' : return  num1*num2 ;
            case '/' : return  num1 / num2 ;
        }
        return  1  ;
    }
    public static void main(String[] args) throws IllegalAccessException {
      try {
          String exp = "- * 9 2 3 / 8 40";
          System.out.println(Evalutionmul (exp));
      }catch (Exception e  ) {
          System.out.println(e.getMessage());
      }
    }
}
