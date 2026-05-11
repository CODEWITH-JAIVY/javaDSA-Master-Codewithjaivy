package com.treecreation;

import java.util.Scanner;
import java.util.Stack;



public class TreeCreation {
    public static Scanner scanner = new Scanner(System.in);

    // Tree creation
    public static Node create() {
        System.out.println("Enter the value (0 for null):");
        int val = scanner.nextInt();
        if (val == 0) return null;

        Node newNode = new Node(val);

        System.out.println("Do you want to create left of " + val + "? (1/0)");
        int choice = scanner.nextInt();
        if (choice != 0) {
            newNode.left = create();
        }

        System.out.println("Do you want to create right of " + val + "? (1/0)");
        choice = scanner.nextInt();
        if (choice != 0) {
            newNode.right = create();
        }

        return newNode;
    }

    // Iterative Preorder
    public static void preorderTraversal(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.println(curr.val);

            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);
        }
    }

    // Reverse order with indentation
    public static void reverseOrderWithSpace(Node root, int level) {
        if (root == null) return;

        reverseOrderWithSpace(root.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("     ");
        }
        System.out.println(root.val);
        reverseOrderWithSpace(root.left, level + 1);
    }

    // Iterative Postorder
    public static void postOrder(Node root) {
        if (root == null) {
            System.out.println("There is no data in the tree to traverse.");
            return;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node curr = stack1.pop();
            stack2.push(curr);

            if (curr.left != null) stack1.push(curr.left);
            if (curr.right != null) stack1.push(curr.right);
        }

        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop().val);
        }
    }
    // iterative approach
public  static void  inOrder( Node  root ) {
        if( root == null ) {
            System.out.println("there is no data to print ");
            return;
        }
        Stack<Node > stack = new Stack<>() ;

        Node curren  = root ;
        while (curren != null  || ! stack.isEmpty() ) {
        // reach at the left buttom
            while (curren != null ) {
                stack.push(curren) ;
                curren = curren.left ;
            }
            curren = stack.pop() ;
            System.out.println(curren.val);
            curren = curren.right ;

        }

}

    public static void main(String[] args) {
        Node root = create();

//        System.out.println("Preorder Traversal:");
//        preorderTraversal(root);
//
//        System.out.println("\nReverse Order with Indentation:");
//        reverseOrderWithSpace(root, 0);
//
//        System.out.println("\nPostorder Traversal:");
//         postOrder(root);
        System.out.println("\n Inorder Traversal ");
        inOrder( root ) ;
    }
}
