package com.recursonproblem;

public class reverceAString {
/*
Reverse a string
Input: "abc" → Output: "cba"
 */
    public  static String Reverce(String str ) {

         if(str .length() == 0) {
             return str   ;
         }

       return  Reverce(str.substring(1) )+ str.charAt(0)  ;

    }
    public static void main(String[] args) {
        String str  = "abc" ;
        String rev = Reverce ( str ) ;
        System.out.println(rev);
    }
}
