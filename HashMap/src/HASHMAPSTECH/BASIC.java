package HASHMAPSTECH;


import java.util.HashMap;
import java.util.Map;

public class BASIC {
    static void main() {
        String s  = "leetcode" ;
        Map<Character , Integer > fre  = new HashMap<>() ;

        for( char  ch  : s.toCharArray() )  {
            fre.put(ch , fre.getOrDefault(ch , 0 ) +1 ) ;
        }


    }
}