package com.BOOKSTACKPROBLEM;

import java.util.Stack;

import static com.BOOKSTACKPROBLEM.reverceStack.display;

public class reveceKelementinstack {
    private static Stack<Integer> stack = new Stack<>() ;
    public static void reverceItem (Stack<Integer>stack , int  Kterm  ) {
                 int term = 0  ;
        if(!stack.isEmpty() ||  term == Kterm ) {
            term ++ ;
            int temp  = stack.pop() ;
            reverceItem(stack , Kterm ) ;
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

    public static void main(String[] args) {
        stack.push(2) ;
        stack.push(3);
        stack.push(4) ;
        stack.push(5);
        stack.push( 6 ) ;
        reverceItem(stack , 3 ) ;
        display (stack) ;
    }
}
