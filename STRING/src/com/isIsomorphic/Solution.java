package com.isIsomorphic;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public   static   boolean isIsomorphic(String s, String t) {
        int i =0  ;
        int  j  =0  ;
        int n  = s.length ()  ;
        Map<Character  , Character > map  = new HashMap<>()  ;
        while( i < n  && j < n ) {

            char schar = s.charAt(i) ;
            char tchar  = t.charAt(j) ;

            if(map.containsKey(schar)  ) {
                if( tchar != map.get(schar) )   return false   ;
            }
            map.put(schar , tchar ) ;
         i++ ;
         j++ ;
        }
        return true   ;
    }

    public static void main(String[] args) {
        String  s  = "foo" ;
        String t  =  "bar" ;
        System.out.println(isIsomorphic(s , t ));
    }
}