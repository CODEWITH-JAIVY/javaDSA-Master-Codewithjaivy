package com.ContrucbstwithPOSTorder;

class Node {
     int val ;
     Node left  ;
     Node right  ;

     Node (int val ) {
         this.val  = val  ;
         this.left = null  ;
         this.right  = null  ;
     }
}
public class bstPostorder {

    public  static Node  bstpost( int[]post  ,int start , int end  )  {
        if(start> end) return   null  ;

        Node root = new Node(post[end]) ;
       int i  ;
        for ( i = end-1 ; i >= 0  ; i-- ) {
            if(post[i] < post[end]) break;
        }
        root.left = bstpost(post , start ,  i ) ;
        root.right = bstpost(post , i+ 1 , end-1) ;
        return  root  ;


    }

  public  static void inorder(Node root )  {
        if( root == null ) return;
        inorder(root.left);
      System.out.print ("| "+root.val);
      inorder(root.right);

  }
  public  static Node   bstINLogn(int []post , int[]index ,int lb ){

        if(index [0]<0 || post[index[0]] <lb ) {
            return null ;
        }
        Node root = new Node(post[index[0]]) ;
        index[0]--;
        root.right = bstINLogn(post , index , root.val ) ;
        root.left = bstINLogn(post , index , lb ) ;
        return root  ;
  }

    public static void main(String[] args) {
        int []post ={ 4,7,5,12,20,15,11,10} ;
      //  Node root = bstpost( post  , 0 , post.length-1 ) ;
        int [] index  = {post.length-1} ;
        Node root = bstINLogn(post , index , Integer.MIN_VALUE) ;
        inorder(root ) ;
        System.out.println("|");
    }
}
