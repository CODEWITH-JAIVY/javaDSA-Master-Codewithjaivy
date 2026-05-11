package com.averageOfLevels;

import java.util.*;

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


public class Solution {
      public  static  void   avg ( TreeNode root , List<Double>list ) {
          if(root == null ) return   ;
          Queue<TreeNode>q =  new ArrayDeque<>() ;
          q.add(root) ;
          while( ! q.isEmpty() ) {
              int size  = q.size() ;
              TreeNode current  = q.poll() ;

              int sum   = 0  ;
              for (int i = 0; i <size ; i++) {
                  int val = current.val  ;
                  sum += val ;
              }
              list.add((double) (sum/size));
              if(current.left != null ) {
                  q.add(current.left) ;
              }
              if(current.right != null ) {
                  q.add(current.right) ;
              }
          }
      }
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> list  =  new ArrayList<>() ;
        if( root == null  )  return  list   ;
        avg  ( root , list ) ;
        return list  ;
    }
}
