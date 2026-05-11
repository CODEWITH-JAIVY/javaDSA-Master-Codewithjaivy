package com.slidingwindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeFromEveryWindow {

    public static void addInQueue(Queue<Integer> queue, int val) {
        if (val < 0) {
            queue.add(val);
        }
    }

    public static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        // Process the first window
        for (int i = 0; i < k; i++) {
            addInQueue(queue, arr[i]);
        }

        // Add the first negative element or 0 if there is none
        if (queue.isEmpty()) {
            ans.add(0);
        } else {
            ans.add(queue.peek());  // The first negative number in the window
        }

        // Now process the rest of the windows
        for (int i = k; i < arr.length; i++) {
            // Remove the element going out of the window
            if (arr[i - k] < 0) {
                queue.poll();  // Remove it from the queue if it's negative
            }

            // Add the new element coming into the window
            addInQueue(queue, arr[i]);

            // Add the first negative element of the current window
            if (queue.isEmpty()) {
                ans.add(0);
            } else {
                ans.add(queue.peek());
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        List<Integer> ans = firstNegInt(arr, 3);
        System.out.println(ans);  // Expected output: [-8, -6, -6]
    }
}
