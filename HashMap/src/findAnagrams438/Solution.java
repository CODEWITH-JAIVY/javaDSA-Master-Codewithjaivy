package findAnagrams438;

import java.util.ArrayList;
import java.util.List;

class  Solution {

    private boolean isAnagram( int []pfre , int[]windowfre) {
        for( int i =0;i<26 ; i++ ) {
            if(pfre[i]  != windowfre[i] ) return false ;
        }
        return true  ;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result  = new ArrayList<>() ;

        int []pfre = new int  [26] ;
        int []windowfre = new int  [26] ;

        for( char ch : p.toCharArray() ) {
            pfre[ch-'a']++ ;
        }

        int windowsize = p.length () ;
        for( int i =0 ; i< s.length() ; i++ ) {
            windowfre[s.charAt(i) - 'a'] ++ ;

            if( i>= windowsize ) {
                windowfre[(s.charAt(i) - windowsize ) -'a'] -- ;
            }
            if(isAnagram( pfre , windowfre)) {
                result.add(i-windowsize +1 ) ;
            }


        }
        return result  ;
    }
}