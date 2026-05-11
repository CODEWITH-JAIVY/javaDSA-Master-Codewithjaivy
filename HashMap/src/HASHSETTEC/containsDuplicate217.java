package HASHSETTEC;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set = new HashSet<>() ;
        for( int val  : nums ) {
            if(set.contains(val)) {
                return true ;
            }
            set.add(val ) ;
        }
        return false ;
    }
}