package com;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BuildTreeFromInorderAndPreorder {

    static int pIndex = 0;

    public static int search(int[] in, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (in[i] == value) return i;
        }
        return -1;
    }

    private static TreeNode construct(int[] pre, int[] in, int start, int end) {
        if (start > end) return null;

        TreeNode root = new TreeNode(pre[pIndex++]);

        if (start == end) return root;

        int inIndex = search(in, start, end, root.val);

        root.left = construct(pre, in, start, inIndex - 1);
        root.right = construct(pre, in, inIndex + 1, end);

        return root;
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        pIndex = 0;
        return construct(preorder, inorder, 0, inorder.length - 1);
    }

    private static void postOrderTraversal(TreeNode root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        int[] pre = {3, 9, 20, 15, 7};
        int[] in = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(pre, in);
        postOrderTraversal(root); // Output should be: 9 15 7 20 3
    }
}
