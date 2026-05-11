package com.constructFromPrePost;

class TreeNode  {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Solution {

    public static TreeNode construct(int[] pre, int[] post, int[] preIndex, int postStart, int postEnd) {
        if (preIndex[0] >= pre.length || postStart > postEnd) return null;

        TreeNode root = new TreeNode(pre[preIndex[0]++]);

        // If it's a leaf node, return
        if (postStart == postEnd || preIndex[0] >= pre.length) {
            return root;
        }

        // Find the index of the next left child (pre[preIndex[0]]) in post[]
        int index = -1;
        for (int i = postStart; i <= postEnd; i++) {
            if (post[i] == pre[preIndex[0]]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            root.left = construct(pre, post, preIndex, postStart, index);
            root.right = construct(pre, post, preIndex, index + 1, postEnd - 1);
        }

        return root;
    }

    public static TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int[] preIndex = {0};
        return construct(preorder, postorder, preIndex, 0, postorder.length - 1);
    }

    public static void display(TreeNode root) {
        if (root == null) return;
        display(root.left);
        System.out.print(root.val +" ");
        display(root.right);
    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] post = {4, 5, 2, 6, 7, 3, 1}; // correct postorder

        TreeNode root = constructFromPrePost(pre, post);
        display(root); // Should print in-order traversal
    }
}
