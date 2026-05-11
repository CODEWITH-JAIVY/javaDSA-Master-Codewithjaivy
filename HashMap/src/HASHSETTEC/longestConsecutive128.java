package HASHSETTEC;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutive128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set  = new HashSet<>() ;
        for( int val : nums ) {
            set.add(val) ;
        }
         int longest  = 0  ;
        for( int val : set ) {
            if( ! set.contains(val-1)) {
                int count =1  ;
                int curr  = val  ;
                while (  set.contains(curr+1)) {
                    count++ ;
                    curr++ ;
                    System.out.println(count);
                }
                longest  = Math.max(longest  , curr) ;
            }
        }
        return  longest ;
    }

    static void main() {
        longestConsecutive128 obj =  new longestConsecutive128() ;
        int [] arr = { 100,1,2,3,200,4 } ;
        int  ans  = obj.longestConsecutive(arr) ;
        System.out.println( "Longest consecutive" +
                " " + ans);
    }
}