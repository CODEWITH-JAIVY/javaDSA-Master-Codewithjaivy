package removeDuplicate26;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int removeDuplicates(int[] nums) {
        Set<Integer> set  = new HashSet<>() ;

        for( int val : nums ) {
            set.add(val) ;
        }
        return set.size() ;
    }

    public static void main(String[] args) {
        int [] arr = { 0,0,1,1,2,2,3,4,4,5,5} ;
        System.out.println(removeDuplicates((arr)));
    }
}