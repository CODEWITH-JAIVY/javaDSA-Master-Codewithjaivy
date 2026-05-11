package com.randomePasswordGeneraor;
import java.util.Random;
public class randomepassowrd {

    public static void main(String[] args) {
        String str  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                      "abcdefghijklmnopqrstuvwxyz" +
                       "1234567890" +
                       "*/`~1@#$%^&*(){}:;'<>?/" ;
        StringBuilder password  = new StringBuilder() ;
        int len = 8  ;
        Random random = new Random() ;
        for (int i = 0; i <len ; i++) {
            int  index  =random.nextInt(str.length());
            password.append(str.charAt(index)) ;
        }
        System.out.println("Password :-"  + password  );
    }
}
