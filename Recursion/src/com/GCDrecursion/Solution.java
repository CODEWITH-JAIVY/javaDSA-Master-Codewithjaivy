package com.GCDrecursion;

public class Solution {
    public  static  int gcdRecurion( int a, int b ) {
        if( b == 0 ) return  a  ;
        return gcdRecurion(b , a%b) ;
    }

    public static void main(String[] args) {
        int a  = 48  ;
        int b = 18 ;
        System.out.println( gcdRecurion(a , b ));
    }
}
