package isAnagram242;

import java.util.HashMap;

class Solution {
    public  static boolean isAnagram(String s, String t) {
        if(s.length()!= t.length () ) return false  ;

        //   int count [] = new int  [26] ;

        //   for( int i = 0 ; i< s.length() ; i++ ) {
        //     count[s.charAt(i) - 'a'] --  ;
        //     count[t.charAt(i) -'a'] ++ ;

        //   }
        //   for( int val : count ) {
        //     if(val != 0 ) {
        //         return false ;
        //     }
        //   }
        //   return true ;

        HashMap<Character , Integer > map  = new HashMap<> () ;
        // HashMap<Character, Integer> map = new HashMap<>();

        for ( char ch  : s.toCharArray () ) {
            map.put ( ch , map.getOrDefault ( ch , 0 ) +1 ) ;
        }

        for( char ch : t.toCharArray () ) {
            if(!map.containsKey(ch)) {
                return false ;
            }
            map.put(ch , map.get(ch)-1 ) ;
            if(map.get(ch)== 0 ) {
                map.remove ( ch ) ;
            }
        }
        return map.isEmpty() ;
    }

    public static void main(String[] args) {
        String s  = "name" ;
        String t  = "anme" ;
        boolean res  = isAnagram(s , t ) ;
        System.out.println(res );
    }
}
