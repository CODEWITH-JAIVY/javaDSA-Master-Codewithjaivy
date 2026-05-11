package com.evaluationOfPrefix;
import java.util.Stack;
/*
 this is handle only a single digit in the expression when in the expression there is  multiple-digit number
  thi scode will produce the wrong out put becase in the case there is no any seperator
aa the digit will be condiser as a charerter */

public class evaluationforsingle {
 // "-*+923/84"    // copute the task
     public  static  int  Compute (  int op1 , int op2 ,char ch )  {
         switch (ch) {
             case '+' : return  op1+ op2 ;
             case '-' : return  op1 - op2 ;
             case '*' : return  op1*op2 ;
             case '/':return op1 / op2 ;
             default:
                 final String s = "Enter vallid opeator ";
         }
         return  -1  ;
     }
     // check the given char is
     static boolean isOperatoe
     (char ch) {
         return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
     }
    public  static  int Evalution(String exp ) throws Exception {
        Stack<Integer> stack  =new Stack<Integer>() ;
        for (int i = exp.length()-1; i >=0  ; i--) {
            char ch = exp.charAt(i) ;

            if(Character.isDigit(ch)){
                stack.push(ch-'0'); // charater assic value to integar
            }
            else if ( isOperatoe(ch)) {
                  int op1 = stack.pop() ;
                  int op2 = stack .pop() ;

                  int Evaluat = Compute (  op1 , op2 , ch ) ;
                  stack.push(Evaluat) ;
            }else  {
                throw new Exception( ch +"this operator is not valid ") ;
            }
        }
        return  stack.pop() ;
    }

    public static void main(String[] args) throws Exception {
         try {
             String exp = "-*%923/84";
             System.out.println(Evalution(exp));
         }catch (Exception e ) {
             System.out.println(e.getMessage());
         }
    }
}
