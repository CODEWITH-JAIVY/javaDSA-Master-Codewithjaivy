package com.DiameterofBinaryTree;


 //* Definition for a binary tree node.
  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public static int height(TreeNode root) {
        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;


    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int len = 0;

        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);

        int depth = height(root);
        return Math.max(left, Math.max(right, depth));
    }
    
}