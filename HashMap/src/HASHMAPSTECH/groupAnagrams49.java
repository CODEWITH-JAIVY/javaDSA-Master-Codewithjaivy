package HASHMAPSTECH;

import java.util.*;

public class groupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap() ;

        for( String ch  : strs ) {
            char[]arr = ch.toCharArray() ;
            Arrays.sort(arr) ;
            String key  = arr.toString() ;

            if(!map.containsKey(key)) {
                map.put(key  ,  new ArrayList<>() ) ;
            }
            map.get(key).add(ch) ;
        }
        return new ArrayList<>(map.values() ) ;
    }
}