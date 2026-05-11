package com.BOOKSTACKPROBLEM;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

//Given  a stack , sort element such that the largest value is at the top
public class SortStack {
   private static Stack<Integer>stack = new Stack<>();

   public void sortStack(Stack<Integer>stack ) {
       if(!stack.isEmpty()) {
           int top = stack.pop();
           sortStack(stack); ;
           insertStack( stack , top ) ;

       }
   }
   private void insertStack( Stack<Integer>stack , int data) {
       if( stack.isEmpty() || stack.peek() <= data ) {
           stack.push(data) ;
       }else {
           int tem = stack.pop() ;
           insertStack(stack ,data );
           stack.push(tem) ;

       }
   }
//   List<Integer> list = new ArrayList<>() ;
//
//       public void sortStack( Stack<Integer> stack ){
//           while (! stack.isEmpty()) {
//               list.add((int)stack.pop() ) ;
//           }
//           Collections.sort(list);
//
//           for(int num  : list ){
//               stack.push(num) ;
//           }
//       }
       public   void display() {
           while(!stack.isEmpty()) {
               System.out.print(stack.pop() + " ");
           }
       }
    public static void main(String[] args) {
        SortStack st = new SortStack() ;
        st.stack.push(1) ;
        st.stack.push(5);
        st.stack.push(3);
        st.stack.push(4) ;
        st.sortStack(stack) ;
        st.display( );

    }


}
