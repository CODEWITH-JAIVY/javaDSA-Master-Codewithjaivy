package com;

import com.sun.jdi.request.BreakpointRequest;

public class Replace {
    /*
    Replace all 'a' with '@'
Input: "java" → Output: "j@v@"

     */
    public static String replace(String str) {
        if (str.length() <= 0) {
            return str;
        }
        char temp = str.charAt(0);
        if (temp == 'a') {
            temp = '@';
        }
       return temp+ replace(str.substring(1));

    }

    public static void main(String[] args) {
        String name  = "java" ;
        String re =  replace(name) ;
        System.out.println(re);
    }
}