package com.bstCreation;

class Node {
    int val  ;
    Node left  ;
    Node right  ;

    Node(int val ) {
        this.val = val ;
        this.left = null  ;
        this.right  = null  ;
    }
}

public class Creation {
  public static  Node   create(Node root, int data )  {

      if(root == null ) {
          return new Node(data) ;
      }
      if( data < root.val ) {
          root.left  = create(root.left , data  );
      }else {
          root.right= create(root.right  , data) ;
      }
      return  root  ;
  }
    public  static  Node  CreatBST(int []arr)  {
        Node root  = null ;
        for (int i =0 ; i<arr.length ; i++ ) {

              root = create(root  , arr[i] ) ;
        }
        return  root ;
    }

    public  static  boolean searchInbinary(int val , Node root  )  {
      if(root == null ) {
          return  false ;
      }
      if(root.val == val ) return  true  ;
      if(val < root.val) {
         return searchInbinary(val , root.left  ) ;
      }else {
          return  searchInbinary(val , root.right) ;
      }

    }

    public  static void  insert(Node root ,int val ) {
       if(root == null  ) {
           new Node (val ) ;
           return;
       }
       Node prev  = null  ;
       while ( root != null  ) {
           prev  = root ;
           if(root.val == val  ) {
               System.out.println("No duplicatrs are allowed ");
               return;
           }else  {
               if(root.val < val ) {
                   root  = root.right ;
               }else {
                   root = root.left ;
               }
           }
       }
       Node newnode = new Node(val) ;
       if(prev.val < val ) {
           prev.right = newnode ;
       }else {
           prev.left = newnode ;
       }
        System.out.println(val +"  is inserted successfully ");
    }
    public static Node insertwithrecusion(Node root, int num) {
        if (root == null) {
            return new Node(num);  // create and return new node when null is reached
        }

        if (num < root.val) {
            root.left = insertwithrecusion(root.left, num);  // insert in left subtree
        } else {
            root.right = insertwithrecusion(root.right, num); // insert in right subtree
        }

        return root;  // return the unchanged root node
    }

    // delete  a vlaue from the bst
    public  static  Node   delete(Node root ,int key  ) {
       if(root == null ) return  null  ;
       if( root.val <key ) {
           root.right =  delete(root.right , key );     
       } else if (root.val > key){
           root.left = delete(root.left  , key ) ;
       }else  {
           // case 1  when the node is leaf node 
           if(root.left == null && root.right ==null) {
               return  null ;
           } 
           // case 2 
           else if (root.left == null) {
               return root.right ;
           }else if(root.right== null ){
               return  root.left ;
           }
           else {
               // there is two option to delete the middle node
               //inorder success
               // inorder predessor
               // there is from inorder predessesor
               Node predessor = find(root.left) ;
               root.val = predessor.val;
                root.left = delete(root.left , predessor.val);
           }
       }
       return  root ;
    }

    public static Node find(Node root ) {
      while(root.right != null) {
          root = root.right ;
      }
      return  root  ;
    }

    public  static void  displaydata(Node root)  {
       if ( root  ==  null) {
           return;
       }
       displaydata(root.left);
          System.out.print (root.val + "  ");
          displaydata(root.right);
      }
    public static void main(String[] args) {
         int []arr = { 10,20,5,10, 6,18,19,13,50,60} ;
         Node root = CreatBST(arr) ;
          boolean result =searchInbinary(60 , root ) ;
          if(result){
              System.out.println("Result found ");
          }else {
              System.out.println("not found ");
          }
          insert(root , 63 ) ;
        displaydata(root) ;
          Node prev  = null  ;
         root = insertwithrecusion(root , 5   )  ;
        System.out.println("");
         displaydata(root) ;
         delete(root , 20 ) ;
        delete(root , 63 ) ;
        System.out.println("");
        displaydata(root) ;
    }
}
