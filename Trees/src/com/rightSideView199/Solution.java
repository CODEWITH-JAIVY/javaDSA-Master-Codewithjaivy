package com.rightSideView199;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
class TreeNode {
    int val  ;
    TreeNode left  ;
    TreeNode right  ;
    TreeNode(int val ) {
        this.val = val ;
        this.left = null  ;
        this.right = null ;

    }
}
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {

            List<Integer>list = new ArrayList<>() ;
            Queue<TreeNode>Q = new ArrayDeque<>() ;

            Q.add(root) ;
            while(Q.isEmpty() ) {
                int size = Q.size() ;

                for( int i =0 ; i< size -1 ; i++ ) {
                    Q.remove () ;
                }
                TreeNode cur =  Q.remove () ;
                list.add(cur.val) ;

                if(root.left != null)  Q.add(root.left) ;
                if(root.right!= null ) Q.add(root.right) ;
            }
            return list  ;
        }
    }

