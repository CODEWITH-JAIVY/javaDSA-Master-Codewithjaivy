package com.ququeusingstack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class usingstack {
//  static Queue<Integer> q  = new ArrayDeque<>() ;
   static  Stack<Integer>mstack = new Stack<>() ;
   static  Stack<Integer>hstack = new Stack<>() ;
 public static void queueImplimentation( Stack<Integer> stack) {
     while (!stack.isEmpty()){
         hstack.push(mstack.pop()) ;
     }
     System.out.println("Uquqe data is ");
     while (! hstack.isEmpty() ) {
         System.out.println(hstack.pop() + " ");
     }
 }
    public static void main(String[] args) {
        mstack.add(10) ;
        mstack.add(20) ;
        mstack.add(30) ;
        mstack.add(40) ;
        mstack.add(50) ;
        queueImplimentation(mstack) ;
    }
}
