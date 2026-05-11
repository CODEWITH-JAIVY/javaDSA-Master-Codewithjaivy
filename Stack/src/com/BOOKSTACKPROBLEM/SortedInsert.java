package com.BOOKSTACKPROBLEM;

import java.util.Stack;

public class SortedInsert {
  Stack<Integer>stack = new Stack<>();
   Stack<Integer>temp = new Stack<>() ;

  public   void  insert(int data ) {
      while(stack.peek () >= data ) {
          temp.push(stack.pop()  );
      }
      stack.push(data) ;
      while(!temp.isEmpty() ) {
          stack.push(temp.pop()) ;
      }
  }
  public   void display() {
      while ( ! stack.isEmpty()) {
          System.out.print(stack.pop() + " ");
      }
  }

    public static void main(String[] args) {
        SortedInsert st = new SortedInsert() ;
    st.stack.push(1) ;
    st.stack.push(2) ;
    st.stack.push(4) ;
    st.stack.push(5) ;

    st.insert(3);
    st.display();
    }
}
