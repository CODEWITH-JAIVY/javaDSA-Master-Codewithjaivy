package com;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReverseString {

     public static  boolean checkAnagram(String s1 , String s2  ) {
         int len1  = s1.length() ;
         int len2  = s2.length() ;
         if(len2 !=  len1  )  return false  ;

         char [] charS1  = s1.toCharArray()  ;
         char [] charS2  = s1.toCharArray() ;

         int [] arr1 = new int [26] ;
         int [] arr2  =new int [26] ;

         for( char ch :charS1   ) {
              int index  =   ch - 'a'  ;
              arr1[index]++ ;
         }
         for( char ch :charS2   ) {
             int index  = ch  - 'a'  ;

             arr2[index]++ ;
         }
         for( int i  = 0  ; i< 26  ; i++ ) {
             if(arr1[i] != arr2[i] ) return  false  ;
         }
         return  true  ;

     }
    public static void main(String[] args) {
        /// Write a method to check if two strings are anagrams of each other (ignore case).


         String s1  = "listen" ;
         String s2  = "silent" ;

//          boolean ans  = checkAnagram (s1  , s2 ) ;
//          if(ans) {
//              System.out.println("Given both String is anagram to each other  ");
//          }else  {
//              System.out.println("Not angaram  ");
//          }


          int [] arr = { 1,1,3,4,5,6,7,8} ;
        Set<Integer>set  = new HashSet<>() ;
        for( int val : arr  ) {
//            set.add(val) ;
            set.add(Integer.valueOf(val));
        }
         for( int val : set ) {
             System.out.println(val);
         }

    }
}