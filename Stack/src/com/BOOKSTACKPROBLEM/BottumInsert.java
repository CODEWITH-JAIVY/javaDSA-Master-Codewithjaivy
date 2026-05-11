package com.BOOKSTACKPROBLEM;

import java.util.Stack;

public class BottumInsert {
static Stack<Integer>stack = new Stack<>() ;
public static void ButtomInsert(int data ) {
     if(stack.isEmpty()) {
         stack.push(data) ;
     }
    else if (!stack.isEmpty()) {
        int top = stack.pop() ;
        ButtomInsert(data);
        stack.push(top) ;
    }
}
    public static void display( Stack<Integer>stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        stack.push(2) ;
        stack.push(3);
        stack.push(10) ;
        stack.push(7);
        stack.push(12) ;
        ButtomInsert(1000) ;
        display(stack);
    }
}
