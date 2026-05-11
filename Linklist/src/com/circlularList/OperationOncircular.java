package com.circlularList;

public class OperationOncircular {
static Node head =  null  ;
static Node tail = null  ;
    public static Node insertAtbegining(int data) {

        Node newnode = new Node(data) ;
        // if the list is empthy than it will insert at the 1st  on beginign and the tail and head will be point
        // same
        if(head == null ) {
             head = newnode ;
             tail = newnode ;
             tail.next = head ;
        } else {
            // if the head is  not null and we have to insert the value at the beging
//            newnode.next = head;
//            head = newnode;
//            tail.next = head ;
            tail.next = newnode ;
            newnode.next = head ;
            tail = newnode  ;
        }
        return head ;
    }
    // insert at the position
    public  static  Node insertATpostion(int pos ,int data  )  {
        Node newnpde = new Node(data) ;
        Node  temp = head ;
        int current_post  =1  ;
        Node prenode =  null  ;
        while( temp.next != head  && current_post <= pos-1 ) {
             prenode = temp ;
            temp = temp.next ;
        }
        if(temp == head ) {
            System.out.println("Postion is not valid ");
            return head  ;
        }
        newnpde.next = temp ;
        prenode.next = newnpde  ;
        System.out.println(data +"is inserted at the postion " + pos );

        return  head  ;
    }

    public   static  void displayList(Node head) {

        if( head == null ) {
            System.out.println("List is empty ");
        }
        Node temp  =  head  ;
        do{
            System.out.print(temp.data + "-> ");
            temp = temp.next ;
        }while (temp != head ) ;
        System.out.println("Back to the head ");
//        System.out.println(head.data);
//        System.out.println(tail.data);
    }

    public static void main(String[] args) {
        Node head = null ;
        head = insertAtbegining(10) ;
        head = insertAtbegining(20) ;
        head = insertAtbegining(30) ;
        displayList(head) ;
        head = insertATpostion(  2 ,  100 ) ;
        displayList(head);
    }
}
