package com.slidingwindow;

public class fixsizewindow {
    public  static  int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxSum  = 0;  ;
        int sum  =  0  ;
        for(int i = 0 ; i <  k -1 ; i ++   ) {
            sum  += arr[i] ;
        }
        sum  = maxSum  ;

        for( int i =1 ; i<arr.length-k ; i++ ) {
            sum = sum -arr[i-1]  + arr[k+i-1] ;
            maxSum  = Math.max( maxSum , sum  ) ;
        }
        return maxSum  ;
    }

    public static void main(String[] args) {
        int  [] arr = { 100,200,300,400 } ;
        int sum  = maxSubarraySum( arr ,  2  ) ;
        System.out.println(sum );
    }
}
