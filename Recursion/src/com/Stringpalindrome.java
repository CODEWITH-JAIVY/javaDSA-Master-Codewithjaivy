package com;

public class Stringpalindrome {
   public  static boolean isPalindrom(String str ) {
       if(str.length() <= 1 ) return  true ;

       if( Character.toLowerCase(str.charAt(0)) != Character.toLowerCase(str.charAt(str.length()-1)) ){
           return  false  ;
       }

       return isPalindrom(str.substring(1 , str.length()-1)) ;
   }

    public static void main(String[] args) {
       String str  = "Madam" ;
         boolean result =  isPalindrom(str) ;
        System.out.println(result);
        System.out.println(str);
    }
}
