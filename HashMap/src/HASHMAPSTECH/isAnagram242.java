package HASHMAPSTECH;

import java.util.HashMap;
import java.util.Map;

public class isAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if( s.length()!=t.length()  ) return false  ;

        char[]sarr = s.toCharArray() ;
        char[]tarr = t.toCharArray() ;

        Map<Character , Integer> fre = new HashMap<>() ;
        for( int i =0 ; i < sarr.length ; i++ ) {
            fre.put(sarr[i] , fre.getOrDefault(sarr[i] , 0 ) +1 ) ;
        }

        for( int i =0 ; i < tarr.length ; i++ ) {
            if(fre.containsKey(tarr[i])) {
                fre.get(tarr[i] -- ) ;
            }
        }
        if(fre.isEmpty() ) {
            return true  ;
        }
        return false ;
    }

    static void main() {
        String s = "aacc" ;
        String t  = "caac" ;
        boolean ans  = isAnagram(s , t ) ;
        System.out.println(ans );
    }
}