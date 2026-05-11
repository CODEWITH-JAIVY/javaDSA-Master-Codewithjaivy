package com.treecreation;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public List<List<Integer>> levelOrders(Node root) {
        List<List<Integer>>ans  =  new ArrayList<>() ;
        Queue <Node>queue  = new ArrayDeque<>() ;
        queue.add(root) ;
        while (!queue.isEmpty() ) {
            int levelSize = queue.size();
            List<Integer>list  = new ArrayList<>() ;

            for (int i = 0; i <levelSize ; i++) {
              Node current = queue.poll() ;
              list.add(current.val) ;
              if(current.left == null ) queue.add(current.left) ;
              if(current.right == null ) queue.add(current.right) ;
            }
            ans.add(list) ;
        }
        return  ans ;
    }
}
