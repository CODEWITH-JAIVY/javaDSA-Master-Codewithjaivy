package com.codewithjaivy;

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

public class reverseList {
    // Function to reverse the list
    public Node reverseList(Node head) {
        Node temp = head;
        Node prevNode = null;
        Node nexNode = null;

        while (temp != null) {
            nexNode = temp.next;    // store next
            temp.next = prevNode;   // reverse link
            prevNode = temp;        // move prev forward
            temp = nexNode;         // move current forward
        }

        head = prevNode;  // new head
        return head;
    }

    // Function to print list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main function
    public static void main(String[] args) {
        reverseList list = new reverseList();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        list.printList(head);

        // Reverse the list
        head = list.reverseList(head);

        System.out.println("Reversed List:");
        list.printList(head);
    }
}
