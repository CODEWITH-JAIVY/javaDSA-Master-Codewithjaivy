package com.reverseBetween92;



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}



class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // Move prev to the node before left
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode next = null;
        ListNode before = prev;

        // Reverse the sublist
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = before.next;
            before.next = next;
        }

        return dummy.next;
    }
}

public class reverseBetweenclass{

    // Create a linked list from array
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int x : arr) {
            temp.next = new ListNode(x);
            temp = temp.next;
        }
        return dummy.next;
    }

    // Print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {1, 2,4, 3, 5, 6, 7, 8, 9};   // example input
        int left = 2;
        int right = 4;

        System.out.println("Original List:");
        ListNode head = createList(arr);
        printList(head);

        System.out.println("\nReversed Between " + left + " and " + right + ":");
        ListNode result = sol.reverseBetween(head, left, right);
        printList(result);
    }
}