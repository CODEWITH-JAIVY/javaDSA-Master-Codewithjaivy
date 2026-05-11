package MinimumAbsoluteDifference1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int mindiff  = Integer.MIN_VALUE ;

        Arrays.sort(arr) ;

        for( int i =0 ; i< arr.length -1 ; i++ ) {
            int min = arr[i+1] - arr[i] ;
            if( mindiff < min ) {
                mindiff = min  ;
            }

        }

        List<List<Integer>>result  = new ArrayList<>()   ;
        for( int i =0  ; i<  arr.length  ;  i++ ) {
            int diff  =  arr[i+1] - arr[i] ;

            if( mindiff == diff ) {
                result.add( Arrays.asList(arr[i] , arr[i+1]) )  ;
            }
        }
        return  result  ;
    }
}