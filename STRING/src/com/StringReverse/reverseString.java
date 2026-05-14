package com.StringReverse;

public class reverseString {
    public static String  reverse(String s ) {
        char []arr  = s.toCharArray()  ;
        int n = s.length()  ;

        int start  = 0  ;
        int end  = n -1 ;
        while (start < end ) {
            char temp  = arr[start] ;
            arr[start] = arr[end] ;
            arr[end] = temp  ;
            start++ ;
            end--  ;
        }
//        return  arr.toString() ; /// this will the addresh of the object not the actutal object
        return  new String(arr) ;
    }
    public static void main(String[] args) {
        String s  = "Hello" ;
        String ans  = reverse(s) ;
        System.out.println(ans);
    }
}