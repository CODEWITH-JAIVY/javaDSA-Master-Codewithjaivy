package com.BOOKSTACKPROBLEM;

import java.util.Stack;

public class sortStackwithoutextraSpace {
  private static  Stack<Integer>stack = new Stack<>() ;


  public static void sort( Stack<Integer> stack)  {
      if(!stack.isEmpty() ) {
          int top  = stack.pop() ;
          sort(stack);
          SortINsert(stack , top ) ;
      }
  }
  public static void SortINsert(Stack<Integer>stack , int data) {
      if( stack.isEmpty() || stack.peek() <= data) {
          stack.push(data) ;
      }else {
          int top = stack.pop() ;
          SortINsert(stack , data );
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
        stack.push(1) ;
        stack.push(7);
        stack.push(150) ;
           sortStackwithoutextraSpace st = new sortStackwithoutextraSpace();
           st.sort(stack) ;
           st.display(stack) ;

    }
}
