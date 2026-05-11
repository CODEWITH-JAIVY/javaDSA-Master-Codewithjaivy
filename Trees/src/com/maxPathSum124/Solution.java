package com.maxPathSum124;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {

    static int maxSum = Integer.MIN_VALUE; // holds global max path sum



    public static int maxPath(TreeNode root) {
        if (root == null) return 0;

        // compute max sum from left and right subtrees (ignore negatives)
        int leftGain = Math.max(maxPath(root.left), 0);
        int rightGain = Math.max(maxPath(root.right), 0);

        // path sum passing through this node as the highest node
        int currSum = leftGain + rightGain + root.val;

        // update global maximum if this path is larger
        maxSum = Math.max(currSum, maxSum);
        System.out.println(maxSum);
        // return best path *continuing* upward (one side only)
        return Math.max(leftGain, rightGain) + root.val;
    }
    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        maxPath(root);  // triggers recursion
        return maxSum;
    }



    public static void main(String[] args) {
        // ✅ Build example tree:
        //        -10
        //        /  \
        //       9   20
        //          /  \
        //         15   7

        TreeNode root = new TreeNode(0);
//        root.left = new TreeNode(-3);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);

        // ✅ Create Solution and compute max path sum
        Solution sol = new Solution();
        int result = sol.maxPathSum(root);

        // ✅ Print result
        System.out.println("Maximum Path Sum = " + result);
    }

}
