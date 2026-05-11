package com.monotonicStack;


import java.util.Stack;

public class BasicOfMonitonic {

    static Stack<Integer> stack = new Stack<>();

    public static int[] monotonic(int[] nums) {
//    ArrayList<Integer> arrayList = new ArrayList<>() ;
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            stack.push(i);
        }

        int size = stack.size() ;
        int [] res  = new int[size] ;
        int index = 0 ;
        while( !  stack.isEmpty()) {
            res[index++] = nums[stack.pop() ];
        }
        return res ;
    }

    public static void main(String[] args) {
        int [] nums  = { 1,2,3,4,1,3} ;
        int [] res = monotonic(nums) ;
        for (int n : res ) {
            System.out.print( n + " ");
        }
    }

}