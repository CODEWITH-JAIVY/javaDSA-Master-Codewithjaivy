package com.Binarysearch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BinarySearch {

    public static Boolean Binaryalgo(int[] arr, int target, int start, int end) {
         int mid = start + ( end - start ) /2  ;
         if(arr[mid] == target ) return  true ;
         if(arr[mid] <= target )  {
             Binaryalgo(arr ,target , mid+1 , end ) ;
         }else  {
             Binaryalgo( arr , target , start , mid -1 ) ;
         }
         return false ;
    }
     public static  Boolean Binary( int []arr  , int target ) {
         int start =0  ;
         int end  = arr.length -1  ;
         return  Binaryalgo(arr , target , 0 , end ) ;
     }

    public static void main(String[] args) {
        int []arr  =  { 1,2,3,4,5,6,7,8,9,10} ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the vlaue of the target ");
        int target = scanner.nextInt() ;
        boolean res  = Binary( arr  , target  ) ;
        System.out.println(res);
    }
}
