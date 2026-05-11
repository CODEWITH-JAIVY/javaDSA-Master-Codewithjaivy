package com.postFixEvaluation;
import java.util.Stack;

public class postFixEvaluation {
    private static boolean isoperator(String token)  {
        if  (token.equals("+")  || token .equals("-")|| token.equals("/") || token.equals("*")  ) {
            return  true  ;
        }
        return  false  ;
    }
    
    public static  int Compute (int num1 , int num2 , String token  ) {
         switch (token) {
             case "+" :return num2+ num1  ;
             case "-" : return  num2 - num1 ;
             case "*":return  num1 * num2  ;
             case  "/" :return  num2 / num1  ;
             default:  throw  new IllegalArgumentException("Operator is not valid ") ;
         }
    }
 public static int evalution(String exp) {
     Stack <Integer > stack = new Stack<>() ;
     String[]strarray  = exp.trim().split("\\s+") ;

     for (int i = 0 ; i< strarray.length  ; i ++ ) {
         String token = strarray[i] ;
         if(isoperator(token)) {
             int num1 = stack.pop() ;
             int num2 = stack.pop() ;
             int newnum = Compute(num1 , num2 , token ) ;
             stack.push(newnum) ;
         }else  {
             stack.push(Integer.parseInt(token)) ;
         }
     }
     return stack.pop() ;
 }
    public static void main(String[] args) {
        try {
            String exp  = getExp();
            System.out.println(evalution(exp));
        }catch (Exception e ) {
            System.out.println(e.getMessage());
        }
    }

    private static String getExp() {
        return "5 6 2 + * 12 4 / -";
    }
}
