package com.SymmetricTree;
import java.util.ArrayDeque;
import java.util.Queue;

class TreeNode{
    int val  ;
    TreeNode left ;
    TreeNode right  ;

    TreeNode(int val ){
        this.val  = val  ;
        this.left = null  ;
        this.right= null  ;

    }
}


/*
this is done with the  recursive approach
class Solution {
    public boolean  Symetric( TreeNode r1,TreeNode r2) {
      if(( r1== null) && (r2==null )) return true ;
      if(r1==null || r2 == null  ) return false  ;
      return ( r1.val == r2.val ) &&
             Symetric( r1.left  , r2.right) && Symetric( r1.right , r2.left) ;
    }

    public boolean isSymmetric(TreeNode root) {
        if( root == null ) return true  ;
          return Symetric( root.left , root.right) ;
    }
}
 */
// now iterative appraoach



public class Solution {

    public static boolean Symetric(TreeNode r1, TreeNode r2) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(r1);
        queue.add(r2);

        while (!queue.isEmpty()) {
            TreeNode n1 = queue.remove();
            TreeNode n2 = queue.remove();

            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null) return false;

            // ✅ Safe value comparison only after null check
            if (n1.val != n2.val) return false;

            // ✅ Mirror enqueue
            queue.add(n1.left);
            queue.add(n2.right);
            queue.add(n1.right);
            queue.add(n2.left);
        }
        return true;
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true; // ✅ prevents root.left NPE
        return Symetric(root.left, root.right);
    }

    public static void main(String[] args) {
        // Build a tree (you can test with null too)
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        boolean result = isSymmetric(root);
        System.out.println("Is tree symmetric? " + result);

        // ✅ test with null root (should NOT crash)
        TreeNode empty = null;
        System.out.println("Empty tree: " + isSymmetric(empty));
    }
}










