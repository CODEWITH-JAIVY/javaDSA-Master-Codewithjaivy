package com.treeCreationPreorderOrPostorder;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class TreeCreation {

    // Search utility
    public static int search(int[] post, int val, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (post[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static Node constructTree(int[] pre, int[] post, int  preIndex, int postStart, int postEnd, int size) {
        if ( postStart > postEnd) {
            return null;
        }

        // Create the root node
        Node root = new Node(pre[preIndex]);

        if (postStart == postEnd ) {
            return root;
        }

        // Find index of next preorder element in postorder array
        int postIndex = search(post, pre[preIndex], postStart, postEnd);

        if (postIndex != -1) {
            // Build left and right subtrees
            root.left = constructTree(pre, post, preIndex, postStart, postIndex, size);
            root.right = constructTree(pre, post, preIndex, postIndex + 1, postEnd - 1, size);
        }

        return root;
    }

    // Utility to print inorder traversal
    public static void printInorder(Node node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        int[] pre = {10, 5, 11, 7, 15, 4};
        int[] post = {5, 11, 10, 4, 15, 7};

        int size = pre.length;


        Node root = constructTree(pre, post, 0 , 0, size - 1, size);

        System.out.println("Inorder traversal of constructed tree:");
        printInorder(root);
    }
}
