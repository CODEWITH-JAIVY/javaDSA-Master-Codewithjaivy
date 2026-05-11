package com.BOOKSTACKPROBLEM;

import java.lang.classfile.instruction.StackInstruction;
import java.util.Stack;

public class reverceStack {
private static  Stack<Integer>stack = new Stack<>() ;

public static void  reverceItem(Stack<Integer>stack ) {
    if(!stack.isEmpty()) {
        int temp  = stack.pop() ;
        reverceItem(stack);
         buttomInser( stack , temp) ;
    }
}
    public static void buttomInser(Stack<Integer>stack ,  int data ) {
    if(stack.isEmpty()) {
       stack.push(data) ;
    }else {
        int temp = stack.pop() ;
        buttomInser(stack ,data );
        stack.push(temp) ;
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
        stack.push(4) ;
        stack.push(5);
        stack.push( 6 ) ;
        reverceItem(stack) ;
        display (stack) ;
    }
}
