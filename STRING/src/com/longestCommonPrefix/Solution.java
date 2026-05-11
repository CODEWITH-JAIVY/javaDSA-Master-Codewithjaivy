package com.longestCommonPrefix;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 && strs ==  null ) return "" ;
      StringBuffer ans  = new StringBuffer() ;
       for( int i =0 ; i < strs[0].length() ; i++ ) {
           char ch  = strs[0].charAt(i) ;

           for (int j = 0; j <strs.length ; j++) {
               if( j >= strs[0].length() || ch != strs[j].charAt(i) ) return  ans.toString()  ;
           }
           ans.append(ch);
       }
       return ans.toString();
    }

    public static void main(String[] args) {
        String [] strs  = {"flower","flower","flower","flower"} ;
        System.out.println(longestCommonPrefix(strs));

    }
}