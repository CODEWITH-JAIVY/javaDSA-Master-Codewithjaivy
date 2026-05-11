package com.singlylist.codewithjaivy;

import java.util.Scanner;

public class singlylistDisplay {
    // node creation
    class Node {
        int data ;
        Node next  ;

        Node(int data ) {
            this.data = data  ;
            this.next = null ;
        }
    }
    Node Head = null  ;

    public Node insert (int  data){
        int Data ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter data to insert at the begingign ");
        Data = scanner.nextInt() ;
        Node tem = new Node(Data) ;

        tem.next = Head ;
        Head = tem ;
        return  Head ;


    }

    public void display(Node Head ) {
        if(Head == null ) {
            System.out.println("List is empty");
            return;
        }
        Node tem = Head  ;
        while( tem !=null ) {
            System.out.print(tem.data + "-> ");
            tem =tem.next ;
        }
        System.out.println("null ");
    }

    public static void main(String[] args) {
        singlylistDisplay list = new singlylistDisplay();
        list.Head = list.new Node(10 ) ;
        list.Head.next = list.new Node(20) ;
        list.Head.next.next = list.new Node(30) ;
        list.Head.next.next.next= list.new Node(40) ;
        list.Head= list.insert(100 ) ;

        list.display(list.Head);
    }
}
