package com;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStack {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    public static void push(int n) {

        // Step 1: Add new element to q2
        q2.add(n);

        // Step 2: Move all q1 elements to q2
        while(!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // Step 3: Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    public static int pop() {

        if(q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return q1.poll();
    }

    // Display stack
    public static void display() {

        System.out.println(q1);
    }

    public static void main(String[] args) {

        push(1);
        push(2);
        push(3);
        push(4);

        display();

        System.out.println("Pop: " + pop());

        display();
    }
}