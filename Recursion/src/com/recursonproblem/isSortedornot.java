package com.recursonproblem;

public class isSortedornot {
    /*
    Check if an array is sorted (ascending)
    Input: [1, 2, 3, 5, 4] → Output: false
     */

    public  static  Boolean Isorted(int[] arr , int index , int max ) {
         if(arr.length == index ) return  true  ;
         if( arr[index] >= max ) {
            max = arr[index] ;

         }
        if(max >  arr[index]) return  false ;

        return  Isorted(arr , index+1 , max ) ;
    }
    public static void main(String[] args) {
        int arr[]  = {1,2,3,8,0,1,};
//        int arr[]={1,2,3,4,5,6,7,8} ;
        Boolean result = Isorted(arr , 0 , arr[0]) ;
        System.out.println(result);
    }
}
