package com.calPoints;

import java.util.Stack;

public class Solution{

    public int calPoints(String[] operations) {
        Stack<Character> stack  = new Stack<>() ;

        for(String ch  : operations  ) {
            switch ( ch ) {
                case  "+":
                    int sum  = 0 ;
                    for( int  i  =0 ; i< 2  ; i++ ) {
                        sum += stack.pop () ;
                    }
                    stack.push((char) sum)   ;

                case "D":
                    int  num  = stack.pop () ;
                    num  *= 2  ;
                    stack.push((char) num) ;

                case "C" :
                    stack.pop() ;
            }

        }
        int sum = 0;
        while(! stack .isEmpty () ) {
            sum += stack.pop () ;
        }
        return sum ;
    }
}