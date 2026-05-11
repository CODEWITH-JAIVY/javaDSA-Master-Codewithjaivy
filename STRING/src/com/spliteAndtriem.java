package com;

public class spliteAndtriem {

    public static String remove(String s ) {
        return s + "Kumar" ;
    }
    public static void main(String[] args) {
        String s  = "sanjeet" ;
        System.out.println(s.substring(2));
        String res  = remove(s) ;
        System.out.println(res);
        System.out.println(s);

//        String s = " sanjet   kumar      jaivy       roy     " ;
//      String []st =  s.split("\\s+") ;
//        System.out.println(st);
//        System.out.println(s);
    }
}