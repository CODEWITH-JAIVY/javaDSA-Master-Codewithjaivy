package com.mergeTwoLists21;

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null)
            return null;

        if (list1 != null && list2 == null)
            return list1;

        if (list2 != null && list1 == null)
            return list2;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Remaining nodes
        if (list1 != null) {
            current.next = list1;
        }

        if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }

    // Utility function to print linked list
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // First List: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        // Second List: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));

        Solution sol = new Solution();

        ListNode result = sol.mergeTwoLists(list1, list2);

        printList(result);
    }
}