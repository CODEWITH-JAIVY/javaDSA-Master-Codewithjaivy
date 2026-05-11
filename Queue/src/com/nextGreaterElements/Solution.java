package com.nextGreaterElements;

import java.util.Stack;

public class Solution {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st =  new Stack<>() ;
    int len = nums.length  ;
     int res [] = new int[len] ;
        // Initialize all results with -1 (default when no greater element exists)
        for (int i = 0; i < len-1; i++) {
            res[i] = -1;
        }
        int k = 0  ;
           for( int i = 0 ; i< nums.length ; i++ ) {
            if( st.isEmpty() ) {
                st.push(nums[i]) ;
            }  else if   ( nums[i] > st.peek() ) {
                 res[k++] = nums[i] ;
                st.push(nums[i] ) ;
            } else if ( nums[i] < st.peek() ) {
                res[k++] = -1  ;
            }
        }
        res[k++] = st.pop() ;
        return res  ;
    }

    public static void main(String[] args) {
//        int nums [] = { 1,2,3,4,3} ;
        int nums [] = {2,3,4,5,5} ;
        int res[]  = nextGreaterElements(nums) ;
        for( int e  : res ) {
            System.out.print(e +"");
        }

    }
}
