package com.WordPattern;

public class wordpattern {
    public  static  void pattern(String  pattern  ) {
        String [] word  = pattern.split( " ") ;
        int len  = pattern.length();
        for(String s  : word ) {
            System.out.println(s );
        }
    }

    public static void main(String[] args) {
        pattern("dog cat  dog fish ");
    }
}