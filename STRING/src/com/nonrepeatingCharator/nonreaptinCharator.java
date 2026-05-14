package com.nonrepeatingCharator;

public class nonreaptinCharator {
    ///  Find First Non-Repeating Character
    public static char nonReaptin(String st ) {

        int [] CountArray  = new int [26] ;
        for(int i  =0 ; i< st.length()  ; i++ ) {
            char   ch   = st.charAt(i) ;
            int index  = ch- 'a' ;
            CountArray[index]++ ;
        }
        for(int i =0 ; i< st.length() ; i++ ) {
            char ch  =  st.charAt(i) ;
            if(CountArray[ch -'a'] == 1 ) {
              return    ch ;
            }
        }
        return '\0' ;
    }
    public static void main(String[] args) {
//        Input string: "aabbcde"
        String st =  "aabbcde"  ;
        char ch  = nonReaptin(st) ;
        System.out.println(ch);
    }
}