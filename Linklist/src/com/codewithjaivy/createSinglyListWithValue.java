package com.codewithjaivy;

import java.util.Scanner;

public class createSinglyListWithValue {
    //1.	Create a Singly LinkedList having 5 nodes with values from 11 to 15
    //     		 Output: 11 -> 12 -> 13 -> 14 -> 15
    public  static  class Node {
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }
     static Node head = null  ;
    public static void  singlylist() {
//        int data;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter data in the range  11 to 15 ");
//        data = scanner.nextInt();
//        Node newnode = new Node(data);


        int limt_data = 5;
        int i = 0;
        while (i < limt_data) {
         int    data;
//            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter data in the range  11 to 15 ");
            data = scanner.nextInt();
            Node newnode = new Node(data);
            if (data < 11 || data > 15) {
                System.out.println("Invalid value! Please enter between 11 and 15.");
                continue;
            }

            if(head == null ) {
                head = newnode  ;
            } else {
                Node temp = head ;
                while (temp.next != null ) {
                    temp = temp.next ;
                }
                temp.next = newnode ;

            }
 i++ ;
        }
        }
        // update the value on position 2 12 to  20
    public static  void updateValue(int pos , int value ) {
        Node temp =  head ;
        int   current_pos =  1  ;
        while( temp!= null && current_pos <= pos) {

            if( current_pos == pos ) {
                System.out.println("Updating vlalue to " + temp.data  + "Value" + value ) ;
                temp.data = value ;
                return;
            }
            temp = temp.next ;
            current_pos ++ ;
        }
    }

    public static  void position(int pos) {
        int current_pos = 1  ;
        Node temp = head ;
        while( temp != null  && current_pos <= pos ) {
            if(current_pos ==  pos ) {
                System.out.println( " the value on the pos " + 4  + "Value is " + temp.data);
                return;
            }
            temp = temp .next ;
            current_pos ++ ;
        }
    }
    // remove the element at the ene
    public  static  void  remove_at_theLst() {
        Node temp = head ;
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }

        // Case 2: If the list has only one node
        if (head.next == null) {
            head = null;
            return;
        }

            while (temp.next.next != null ) {
            temp = temp.next ;
        }
        temp.next = null  ;
    }
    // remove the contail element  contains_elementRemove(12) ;
    public static void contains_elementRemove(int value) {
        Node temp = head;
        Node prev = null;

        // Case 1: Agar list empty hai
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // Case 2: Agar value head par hi ho
        if (head.data == value) {
            System.out.println(value + " value removed from head");
            head = head.next; // head ko aage shift kar diya

        }
        temp = head;
        // Case 3: Agar value middle ya end me ho
        while (temp != null ) {
            prev = temp;
            temp = temp.next;
            if( temp.data == value ) {
                prev.next = temp.next ;
                System.out.println(value + " value removed successfully");
                temp = temp.next;
            }
        }

        // Agar value nahi mili
        if (temp == null) {
            System.out.println(value + " not found in the list");
            return;
        }

        // Agar value mili, to node ko unlink kar do
//        prev.next = temp.next;
//        System.out.println(value + " value removed successfully");
    }
    public  static  void entire_linked_list() {
        if( head == null ) {
            System.out.println("Head is allready null ");
            return;
        }
        head = null ;
        System.out.println("Entire linked list is delter ");
    }

    public  static  void singlylistDisplay() {
        if(head == null) {
            System.out.println("List is empty ");
            return;
        }
        Node temp = head ;
        while (temp != null ) {
            System.out.print(temp.data + "-->");
            temp = temp.next ;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        singlylist() ;
        singlylistDisplay() ;
//        updateValue(2 , 20); ;
//        singlylistDisplay() ;
//        position(4) ;
//        remove_at_theLst() ;
//        singlylistDisplay() ;
//        contains_elementRemove(11) ;
//        singlylistDisplay() ;
        entire_linked_list();
        singlylistDisplay()  ;

    }
}
