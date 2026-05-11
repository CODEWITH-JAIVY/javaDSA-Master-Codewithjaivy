package com;

public class PalindromString {
    public static  boolean isPalindrom (String str ) {
        String rev  = String.valueOf(new StringBuffer(str).reverse());

        if(str.equals(rev)) {
            return  true  ;
        }
        return false ;
    }

    public static void main(String[] args) {
        boolean  ans  = isPalindrom("mam") ;
        System.out.println(ans);
    }
}