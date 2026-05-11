package com.implimentQueuesuingStack;

import java.util.ArrayDeque;
import java.util.Queue;

public class implimentstackusingqueue {
    Queue<Integer>q1 ;
    Queue<Integer>q2 ;
    public implimentstackusingqueue() {
         this.q1 = new ArrayDeque<>();
         this.q2 = new ArrayDeque<>() ;
    }

    public void push(int x) {
        if (q1.isEmpty()) {
            q1.add(x);
        } else {
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            q1.add(x);

            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
        }
    }
    public int pop() {
       return q1.poll();
    }

    public int top() {
     return q1.peek() ;
    }

    public boolean empty() {
      if(! q1.isEmpty()) {
          return false ;
      }
      return  true  ;
    }

    public static void main(String[] args) {
        implimentstackusingqueue stack = new implimentstackusingqueue() ;
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop() );
        System.out.println(stack.top() );
        System.out.println(stack.empty());
    }
}
