package com.codewithjaivy;

public class Traversal {
// to traversal in the doubly linked list first insert the element

    // create head
     static  Node head  = null ;  ;

    public  static  void insert(int data ) {
        Node newnode = new Node(data) ;
        // if the head is null
        if(head == null ) {
            head = newnode ;
//            System.out.println( data  + " insert as head ");
            return;
        }
        Node temp = head ;
        while (temp.next != null  ) {
            temp = temp.next ;
        }
        temp.next = newnode ;
        newnode.prev= temp ;
//        System.out.println(data + " iserted in the last of the list ");
    }

    // insert at the begning
     public  static void  inserAtbeging(int data ) {
        Node newnode = new Node(data) ;
        if(head ==  null ) {
            head = newnode ;
            return;
        }
        Node temp = head  ;
        newnode.next = temp ;
        temp.prev = newnode ;
        head = newnode ;
     }
     //insert at the specific position
//     public  static  void insertAtSpecificPos(int pos , int value ) {
//        Node newnode = new Node(value) ;
//        //  case  1 .  if the head is null
//        if(head == null && pos ==1  ) {
//            inserAtbeging(value) ;
//            return;
//        }
//         // if there is only one element
//
//          Node temp = head  ;
//        int current_pos  = 1  ;
//        while(temp  != null && current_pos <= pos  ) {
//         current_pos ++ ;
//         temp = temp .next ;
//        }
//         // Case 2: Insert at end (if pos is larger than length)
//         if (temp == null || temp.next == null) {
//             temp.next = newnode;
//             newnode.prev = temp;
//             return;
//         }
//        // case 3 insert in the middle of the list
//         newnode.next = temp.next;
//         newnode.prev = temp;
//         temp.next.prev = newnode;
//         temp.next = newnode;
//     }

    public static void insertAtSpecificPos(int pos, int value) {
        Node newnode = new Node(value);

        // Case 1: Insert at beginning or into empty list
        if (head == null || pos == 1) {
            newnode.next = head;
            if (head != null) {
                head.prev = newnode;
            }
            head = newnode;
            return;
        }

        Node temp = head;
        int current_pos = 1;

        // Traverse to node just before position
        while (temp != null && current_pos < pos - 1) {
            temp = temp.next;
            current_pos++;
        }

        // Case 2: Insert at end (pos beyond length)
        if (temp == null || temp.next == null) {
            temp.next = newnode;
            newnode.prev = temp;
            return;
        }

        // Case 3: Insert in middle
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next.prev = newnode;
        temp.next = newnode;
    }

    public static void  deleteFrombeginig()  {
        // if the list is empty
        if( head == null ) {
            System.out.println("List is empty nothing to delete ");
            return;
        }
        // if there is only one node in the list
        if(head.next == null ) {
            head = null ;
            System.out.println("Node is deleted form the begining ");
            return;
        }
        // if there is more than the two node in the list than delete at the begining
        Node temp = head ;
        head = head.next ;
        head.prev = null ;
        temp.next = null ;
    }

    // delete from  the end
    public  static  void deleteFromend()  {
        if(head == null) {
            System.out.println("List is empthy nothing to delete ");
            return;
        }
        if(head.next == null ) {
            head = null ;
            System.out.println("Node is deleted form the begining ");
            return;
        }

        Node temp = head  ;
        while ((temp.next != null )) {
            temp = temp.next ;
        }
        Node previos = temp.prev ;
        previos.next = null ;
        temp.prev= null  ;
        System.out.println("Last node is delete with vlaue ");
    }

    // delete from the specific position
    public static void   deleteFromSpecificPost(int pos  ) {
        if (head == null ) {
            System.out.println("List is empty nothing to delete ");
            return;
        }
        // if position is 1  ;
        if(pos == 1  ){
            deleteFrombeginig();
            return;
        }
        int current_pos = 1  ;
        Node temp = head  ;
        while (temp != null && current_pos<  pos   ) {
            current_pos ++ ;
            temp = temp .next ;
            }
           // if pos in not valid
        if(temp == null ) {
            System.out.println("Posistion is not valid " ) ;
            return;
        }
        // if the position is middle
        if(temp.next !=  null  ) {
            temp.next.prev  = temp.prev ;
        }
        if(temp.prev != null ) {
            temp.prev.next = temp.next ;
        }
        temp.next = null ;
        temp.prev = null ;

    }
    // Ispalindrom
    public  static  boolean  Ispalindrom()  {
        if(head == null ||  head.next  == null   ) {
            System.out.println("No palindrom ");
            return false;
        }

        Node temp = head ;
        while (temp .next!= null ) {
            temp = temp.next ;
        }
         Node tail = temp ;

        temp = head  ;
        while (temp.data != tail.data  || temp == tail ) {
            if(temp.data != tail.data) {
                return  false ;
            }
            temp=temp.next ;
            tail = tail.prev ;
        }
        return true  ;
    }
    // travesal in the forword direction
     public static  void forworddirection(){
        if(head == null) {
            System.out.println("List is empty ");
            return;
        }
        Node temp   = head  ;
        while(temp  != null  ) {
            System.out.print( temp.data + "--> " );
            temp = temp.next ;
        }
         System.out.println("End");
     }

      // traversdal in backword direction
     public  static  void  backwordDirection () {
        if(head == null ) {
            System.out.println("List is list ");
            return;
        }
        Node Temp  = head ;
         Node temp   = head  ;
         while(temp .next != null  ) {
             temp = temp.next ;
         }
         Node tail  = temp ;
         while ( tail != null ) {
             System.out.print(tail.data + "-->");
             tail = tail.prev ;
         }
         System.out.println("End");
     }
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(20);
        insert(10);
////        System.out.println("Forword direction ");
//        forworddirection() ;
//        System.out.println("Backword Direciton ");
//        backwordDirection ()  ;
        // insert at the begining
//        inserAtbeging(100) ;
//        forworddirection() ;
//        insertAtSpecificPos(2 , 1000) ;
//        insertAtSpecificPos(2 , 200 ) ;
//        insertAtSpecificPos(2 , 1000) ;
//        forworddirection() ;
//        deleteFrombeginig() ;
//        forworddirection() ;
//        deleteFromend() ;
//        forworddirection() ;
//        deleteFromSpecificPost( 2 ) ;
        forworddirection() ;
          boolean result = Ispalindrom() ;
          if(result) {
              System.out.println("List is palindrom ");
          }else {
              System.out.println("Not palindrom ");
          }
    }
}
