package com.withArraydeueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class arrayququeimplimnetion {

    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // Insert at rear
        dq.addLast(10);
        dq.addLast(20);

        // Insert at front
        dq.addFirst(5);
        dq.offerFirst(2);

        System.out.println("Deque after inserts: " + dq); // [2, 5, 10, 20]

        // Remove from front
        System.out.println("Removed front: " + dq.removeFirst()); // 2

        // Remove from rear
        System.out.println("Removed rear: " + dq.removeLast()); // 20

        System.out.println("Final deque: " + dq); // [5, 10]

    }
}
