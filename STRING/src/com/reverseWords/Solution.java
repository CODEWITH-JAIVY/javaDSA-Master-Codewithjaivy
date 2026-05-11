package com.reverseWords;

class Solution {
    public static String  reverseWords(String s) {
        StringBuffer ans = new StringBuffer() ;
           s = s.trim() ; // trim will be lead last and first whitespace

         String[] word  = s.split("\\s+") ; // splite will be splite \\s+ internal white space

        for (int i = word.length -1 ; i >= 0 ; i-- ) {

            ans.append(word[i]);
            if(i>0 )ans.append(" ") ;
        }
return ans.toString() ;
       }


    public static void main(String[] args) {
        String s  = "            the sky is        blue             " ;
       // System.out.println( reverseWords(s));
        System.out.println(reverseWords(s));

    }
}