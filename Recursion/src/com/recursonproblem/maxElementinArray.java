package com.recursonproblem;

public class maxElementinArray {
     /*
     Find maximum element in array
     Input: [2, 7, 1, 9, 3] → Output: 9
      */

    public static int Max( int [] arr , int index  , int max  ) {

        if( index  == arr.length ) {
            return  max  ;
        }
        if(arr[index] > max ) {
            max = arr[index] ;
        }
        return  Max(arr , index+1 , max ) ;
    }
    public static void main(String[] args) {
        int [] arr = { 2,7,1,9,3} ;

        int max =   Max( arr , 0 , 0 ) ;
        System.out.println(max);
    }
}
