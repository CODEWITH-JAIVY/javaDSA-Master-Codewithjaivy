package com.NextGreateElements503;

import java.util.Stack;

public class Solution {
    public static  int[] nextGreaterElements(int[] nums) {
        int len = nums.length  ;
        int []res = new int[nums.length] ;

        Stack<Integer> stack = new Stack<>() ;

        for( int i  = 2 *len-1  ; i>=0 ; i--   ) {
            while(stack.size() > 0  && nums[stack.peek()] <= nums[i % len ] ) {
                stack.pop() ;
            }
            res[i%len] = stack.isEmpty() ? -1 : nums[stack.peek()] ;
            stack.push(i%len) ;
        }

        return res  ;
    }

    public static void main(String[] args) {
       int res [] = {1,2,3,4,3} ;
        int ans [] = new int[res.length] ;
        ans = nextGreaterElements(res) ;
        for (int num  : ans ) {
            System.out.print(num + "  ");
        }

    }

}