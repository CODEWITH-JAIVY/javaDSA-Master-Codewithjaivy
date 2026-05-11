package TwoPointer;

import java.util.HashSet;
import java.util.Set;

public class Twosums {
    public  static int[] twoSum(int[] num, int target) {
        int start =  0  ;
        int end = num.length  -1 ;

        while( start < end ) {
            int sum  = num[start] +  num[end] ;

            if( sum  == target ) {
                return new int [] { start , end } ;
            }else if ( sum > target ) {
                end -- ;
            }else {
                start ++ ;
            }
        }
        return new int  []{} ;
    }

    public static void main(String[] args) {
        int []arr = { 2,7,11,15} ;
        int []res = twoSum(arr , 9 ) ;
        System.out.println(res[0] + " " +  res[1]);
    }
}