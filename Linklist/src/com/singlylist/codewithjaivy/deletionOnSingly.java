package com.singlylist.codewithjaivy;

public class deletionOnSingly {
    Node Head = null  ;
    Node tail  = null ;
    public  void insertDAta ( int data ) {
        Node newnode  = new Node(data) ;

        // if head is null means there is no any element in the list than just update the head and updata the tail
        if( Head == null) {
            Head = newnode ;
            tail =newnode ;
        }
        //  othere wise witch data is coming just insert tha data  at the end and update the tail
//        Node temp = Head ;
        else  {
         tail.next = newnode ;
         tail = newnode  ;
        }
    }
    public void deleteAtBegining() {
        if(Head == null ) {
            System.out.println("List is empty ");
            return;
        }

//    Node temp = Head ;
        System.out.println("Deleted data is " + Head.data );
    Head = Head.next ;
    if(Head == null ) {
        tail = null ;
    }

    }
     // delete at the end
    public  void deleteATEnd() {
        if(Head == null ) { // if List  is empty
            System.out.println("List is empty ");
            return;
        }
        // if there is  only one element in the list
        if(Head.next == null ) {
            Head = null ;
            tail = null  ;
            return;
        }
        Node temp = Head ;
        while(temp.next.next != null) {
            temp = temp.next ;
        }
        System.out.println("Delete data is " + temp.data);
        temp.next = null  ;
        tail = temp ;

    }


    // delete at the specific possition in the function we travers two time
//    public void SpecificPostionEnd(int pos ) {
//        int len  =  0 ;
//        int i  =1 ;
//        Node temp = Head ;
//        while (temp != null ) {
//            len++ ;
//            temp = temp.next ;
//
//        }
//        if(pos==1 ) {
//            deleteAtBegining();
//        }
//        if(pos == len) {
//            deleteATEnd();
//        }
//        // traver at the pos
//if(pos >= 0 && pos <= len ) {
//    temp = Head ;
//    Node prev = temp   ;
//    while( i < pos ) {
//        prev = temp ;
//        temp = temp.next ;
//        i++  ;
//    }
//
//    System.out.println("datele data is " + temp.data);
//  prev.next = temp.next ;
//}
//else {
//    System.out.println("Position is not valid ");
//}
//    }

    public void  SpecificPostionEnd (int pos ) {
        Node temp = Head ;
        Node preNode = null  ;
        int current_position = 1 ;

        if( Head ==  null ) {
            System.out.println("List is empty ");
            return;
        }
        if(pos == 1 ) {
            deleteAtBegining();
            return;
        }
        while( temp != null && current_position <= pos ) {
            // if the current pos is equal to pos
            if( current_position ==  pos ) {
                System.out.println("Delete time " + temp.data  +" From the pos " + pos );
                preNode.next=temp.next ;
                return;

            }
            current_position++ ;
            preNode = temp ;
            temp = temp.next ;
        }
    }
    // display the  list
    public void display() {
        Node temp  = Head ;
        while(temp != null ) {
            System.out.print(temp.data + "-->");
            temp = temp.next  ;
        }
        System.out.print("End");
    }

    public static void main(String[] args) {
        deletionOnSingly obj = new deletionOnSingly() ;
        obj.insertDAta(10);
        obj.insertDAta(20);
        obj.insertDAta(30);
        obj.insertDAta(40);
        obj.display();
//        System.out.println( " ");
//        obj.deleteAtBegining();
//        obj.display();
        System.out.println(" ");
//        obj.deleteATEnd();
//        obj.display();
        obj.SpecificPostionEnd(2);
        obj.display();

    }
}
