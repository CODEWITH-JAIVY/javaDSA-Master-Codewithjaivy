package com.dequeImplimentaion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class dequeimplimetation {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>() ;
        List<Integer> list = new ArrayList<>() ;
        ConcurrentLinkedDeque cquqe = new ConcurrentLinkedDeque() ;
        ConcurrentLinkedDeque<String> cq = new ConcurrentLinkedDeque<>() ;

        cquqe.add(10) ;
        cquqe.add(20) ;
        cquqe.add(30) ;
        cquqe.add("Hello") ;
        cquqe.addFirst(1000);
        cq.add("Hello") ;
        cq.add("Bye") ;
        cq.add("kaise ho ") ;
        System.out.println(cq);
        System.out.println(cquqe);
        deque.add(10) ;
        deque.addFirst(20) ;
        deque.addFirst(40) ;
        deque.addFirst(50);

        list.add(100) ;
        list.add(200) ;
        list.add(400);
//        System.out.println(deque);
//        deque.addAll(list) ;
        deque.addAll(list);
//        System.out.println(deque );

        deque.removeLast();
//        System.out.println(deque);
        deque.remove(list );
//        System.out.println(deque);

    }

}
