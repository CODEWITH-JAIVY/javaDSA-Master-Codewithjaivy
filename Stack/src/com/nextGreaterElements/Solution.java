package com.nextGreaterElements;

import java.util.Stack;

public class Solution {
    public static int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Stack<Integer> st = new Stack<>();

        // Initialize results with -1
        for (int i = 0; i < len; i++) {
            res[i] = -1;
        }

        // Traverse from right to left
        for (int i = len - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                res[i] = st.peek(); // Peek instead of pop
            }

            st.push(nums[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 5, 5};
        int res[] = nextGreaterElements(nums);

        for (int e : res) {
            System.out.print(e + " ");
        }
    }
}
