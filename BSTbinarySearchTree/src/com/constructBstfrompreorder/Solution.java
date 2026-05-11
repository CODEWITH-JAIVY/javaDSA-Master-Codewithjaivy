package com.constructBstfrompreorder;

import java.util.Stack;

class Node {
    int val  ;
    Node left  ;
    Node right  ;

    Node (int val  ) {
        this.val = val ;
        this.left  = null  ;
        this.right = null  ;

    }
}
public class Solution {

public  static Node  construct(int []pre , int start   , int end ) {
    if(start> end ){
        return  null  ;
    }
    Node root = new Node(pre[start]) ;
    int i ;
    for ( i =start+1 ; i <end  ; i++) {
         if(pre[i]>pre[start]) break;
    }
    root.left  = construct(pre , start+1 , i-1 ) ;
    root.right = construct(pre , i , end) ;
    return  root ;
}
public  static void display(Node root ){
    if(root == null )return;

    display(root.left);
    System.out.print(root.val+" ");
    display(root.right);


}
    public static Node create(int[] arr, int[] index, int up) {
        // Base case: if the current node's value exceeds the upper limit or index exceeds the array length, return null
        if (arr[index[0]] > up || index[0] >= arr.length-1) {
            return null;
        }

        // Create a new node with the current value at index[0]
        Node root = new Node(arr[index[0]]);
        index[0]++;  // Move the index forward for the next recursive call

        // Recursively build the left and right subtrees
        root.left = create(arr, index, root.val);  // Left child must be smaller than root
        root.right = create(arr, index, up);       // Right child must be smaller than the upper limit

        return root;
    }

public  static Node createIterative(int []pre) {
    if(pre.length == 0 )  return  null  ;
    Node root = new Node(pre[0]) ;
    Stack<Node>stack = new Stack<>() ;
    stack.push(root) ;
    for (int i = 1; i <pre.length ; i++) {
        Node prev = new Node(pre[i]) ;
        // cheack this prebv new node which side go either left or right
        // if the incoming element is less than the stack.pee() just indert in the left side  of the peek()
        if(stack.peek().val>pre[i]) {
            stack.peek().left = prev ;
            stack.push(prev) ;

        }else {
            //  if the incoming data is greater than the stack.peek then
            // remove from the stack while either stack is not empty or stack.peelk()is greter than the incoming data

            Node parent = null ;
            while (!stack.isEmpty() && stack.peek().val<pre[i]) {
                 parent = stack.pop() ;
            }
            parent.right = prev ;
            stack.push(prev) ;
        }
    }
    return  root  ;
}
    public static void main(String[] args) {
        int []pre = { 10,5,4,7,11,15,12,20,18} ;
        // time complexity (n log n )
//         Node root = construct(pre , 0  , pre.length-1) ;
//        display(root);
         // reduce the time complexity o(n ) linear time complexity
        int []Index ={0} ;
//        Node root=   create( pre , Index , Integer.MAX_VALUE) ;
//         display(root);
         Node root =createIterative(pre) ;
        display(root);

    }
}
