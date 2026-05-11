public class ArraytoLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node head = null;

    public static void insertInList(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;  // Initialize head if list is empty
            return;
        }

        Node temp = head;
        while (temp.next != null) {  // Traverse to the last node
            temp = temp.next;
        }

        temp.next = newNode;  // Link the new node at the end
    }

    public static void display() {
        if (head == null) {
            System.out.println("List has no data");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int value : arr) {
            insertInList(value);
        }
        display();
    }
}
