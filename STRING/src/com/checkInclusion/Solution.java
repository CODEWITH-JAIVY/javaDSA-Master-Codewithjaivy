package com.checkInclusion;

import java.security.SecureRandom;

class Solution {
  public static  boolean issame (int[]fre , int[]windfre ) {
      for( int  i =0 ; i< 26  ; i++ ) {
          if(fre[i] != windfre[i]) return  false ;
      }
      return  true ;
  }
    public static boolean checkInclusion(String s1 , String  s2 ) {

        int fre [] = new int[26] ;
        for( int i = 0  ; i< 26  ; i++ ) {
            fre[i] = 0 ;
        }
        for( int i =0 ; i  < s1.length() ; i++ ) {
            fre[s1.charAt(i) - 'a'] ++ ;
        }

        int windlen = s1.length() ;

        for( int i  = 0 ; i< s2.length() ; i++ ) {
            int windfre [] = new int[26] ;
            for( int k =0; k< 26  ; k++ ) {
                windfre[k] = 0 ;
            }
            int windind  = 0 ;
            int ind = i   ;
            while ( windind < windlen && ind < s2.length()) {
                windfre[s2.charAt(ind) - 'a']++ ;
                windind++ ;
                ind++ ;
            }
            if( issame (fre , windfre )) return  true  ;
        }
        return  false ;

    }

    public static void main(String[] args) {
       String s1  = "ab" ;
        String s2 = "eidbaooo" ;
        System.out.println(checkInclusion(s1  , s2 ));
    }
}