package com.singlylist.codewithjaivy;
// insert at the begining  of the list
public class SinglyList {
    private Node Head = null  ;
    private  Node Tail = null  ;

    public void InsertAtBegining (int data ){
          Node newnode = new Node(data ) ;
          newnode.next = Head ;
          Head = newnode ;

          // update the tail pointer
        if(Tail ==  null ) {
            Tail = newnode ;
        }

    }
    // insert at the end of the list
    public void insertAtEnd(int data) {
        // the timeComplexity to insert at the end  is o(1) ( constant  time just update the pointer
        Node newnode = new Node(data) ;
        Tail.next = newnode ;
        Tail = newnode ;
    }

    // insert at the specific postion
//    public  void insertAtSpecificPos( int data , int pos ) {
//        // create a node to inset the data
//        Node newnode = new Node(data) ;
//
//         // Edge case cheak that the pos is valid or not
//        int len =0 ;
//        Node tem = Head  ;
//        while( tem != null) {
//            len++ ;
//            tem = tem.next ;
//        }
//        System.out.println("Working");
//        System.out.println(len);
//        if(pos >= 1 && pos <= len+1) {
//            int i  = 0 ;
//             tem = Head  ;
//             while( i< pos-1  ) {
//                 tem = tem.next ;
//                 i++ ;
//             }
//             newnode.next = tem.next ;
//             tem.next= newnode ;
//
//        }else {
//            System.out.println("ENter the valid position");
//        }
//    }

    public  void insertAtSpecificPos( int data , int pos ) {
        // travers only once in the list and insert at the specific postion
        int currentPos =1 ;
        Node temp = Head  ;
        Node PrevNode = null ;
        Node newnode = new Node(data) ;
        while (temp != null && currentPos <= pos ) {
            if(currentPos == pos ) {
                // insert the value
                newnode.next = temp.next ;
                temp.next= newnode ;
                System.out.println("Inserting data at the position"+ pos +  "And the value is" + data );
                return;
            }
            PrevNode = temp ;
            temp = temp.next ;
            currentPos++ ;
        }

    }


    // insert data at the spesific postion  before the  element
    public void insertElementafter(int data , int element) {
        Node newnode =new Node(data) ;
        Node temp =  Head  ;
        int currentPost=1  ;
        while( temp .next != null  && temp.data != element  ) {
            currentPost ++ ;
            temp = temp.next ;
        }
        newnode.next = temp.next ;
        temp.next = newnode ;
        System.out.println("Inserting postion is " + currentPost );
    }

    public void insertElementBefore(int data, int keyElement) {
        if (Head == null) {
            System.out.println("❌ List is empty");
            return;
        }

        if (Head.data == keyElement) { // अगर head से पहले डालना है
            InsertAtBegining(data);
            return;
        }

        Node temp = Head;
        while (temp.next != null && temp.next.data != keyElement) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("❌ Element not found!");
            return;
        }

        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;
        System.out.println("✅ Inserted before " + keyElement);
    }
     // dipaly the list item
    public void Display() {
        Node temNode =Head  ;
        if( Head ==  null) {
            System.out.println("List is empty ");
        }
        while(temNode != null ) {
            System.out.print(temNode.data+ " --> ");
            temNode = temNode.next ;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
          SinglyList obj = new SinglyList() ;
          obj.InsertAtBegining(10); ;
          obj.InsertAtBegining(30); ;
          obj.InsertAtBegining(40);

//          obj.Display();
//         obj.insertAtEnd(100);
//         obj.Display();
         obj.insertAtSpecificPos(200 , 2 );
//         obj.Display();
//         obj.insertElementafter (1000 , 30 );
         obj.Display();
//         obj.insertElementBefore(2000 , 30);
//         obj.Display();
    }


}
