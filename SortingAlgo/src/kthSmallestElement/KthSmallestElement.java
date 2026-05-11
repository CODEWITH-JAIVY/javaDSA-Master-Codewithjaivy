package kthSmallestElement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KthSmallestElement {
public  static int kThSmllest( int []arr , int target ) {
    Arrays.sort(arr);
    return arr[target-1] ;
}
    public static void main(String[] args) {
        int [] arr  = { 7,10,4,3,20,15} ;
        int res  = kThSmllest ( arr , 3 ) ;
        System.out.println(res);
    }
}
