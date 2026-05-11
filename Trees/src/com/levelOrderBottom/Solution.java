package com.levelOrderBottom;

import java.util.*;

class TreeNode {
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> sublist = new ArrayList<>();
            int levelsize = queue.size();
            for (int i = 0; i < levelsize; i++) {
                TreeNode current = queue.remove();
                sublist.add(current.val);

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            list.add(0, sublist); // add at beginning for bottom-up
        }
        return list;
    }

    public static void main(String[] args) {
        /*
         Input: [3,9,20,null,null,15,7]

              3
             / \
            9  20
              /  \
             15   7
        */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        List<List<Integer>> result = solution.levelOrderBottom(root);

        // Print the result
        System.out.println(result);
    }
}
