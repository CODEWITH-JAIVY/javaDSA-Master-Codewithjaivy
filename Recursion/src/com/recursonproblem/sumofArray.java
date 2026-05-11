package com.recursonproblem;

public class sumofArray {

    /*
    Sum of array elements (recursively)
Input: [1, 2, 3, 4] → Output: 10
     */
     public  static  int sum  = 0 ;
    public static int Sum( int []arr , int index  ) {
        if (arr.length == index ) {
            return  0 ;
        }
        return arr[index] + Sum(arr , index+1 ) ;
    }

    public static void main(String[] args) {
        int []  arr = { 0,0,0,0,0,0,0,1,0} ;
        int sum  = Sum(arr , 0 ) ;
        System.out.println("Sum of the given array" + sum );
    }
}
