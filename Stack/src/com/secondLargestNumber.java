package com;

import java.util.HashMap;
import java.util.Stack;

public class secondLargestNumber {

    // Find the second largest element in an unsorted
    // array in a single traversal. Handle duplicates.

    public static int secondLargest(int[] arr) {
        Stack<Integer>stack  = new Stack<>() ;
        int second =  0  ;
        for(int i =0 ; i< arr.length  ;  i++ ) {
            if(stack.isEmpty()) {
                stack.push(arr[i] ) ;
            } else {
                // incresing monotonic stack
                if(stack.peek() <  arr[i] ) {
                    second  =  stack.pop() ;
                    stack.push(arr[i] ) ;
                }

            }

        }
       return  second  ;
    }

    public static void main(String[] args) {
        int [] arr = { 6,7,1,2,3,4,5,6,0 } ;
        int ans  = secondLargest(arr ) ;
        System.out.println(ans );
        HashMap<Integer , Integer > map  = new HashMap()  ;
        map.put(1, 1 )  ;

    }

}