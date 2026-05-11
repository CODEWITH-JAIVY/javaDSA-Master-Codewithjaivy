package GrapgTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public  class BFSTraversal {
    int vertex  ;
    ArrayList<ArrayList <Integer> >Graph  = new ArrayList<>() ;

    BFSTraversal(int vertex ) {
        this.vertex = vertex ;

        for (int i = 0; i < vertex; i++) {
            Graph.add(i , new ArrayList<>()) ;
        }
    }

    public void add(int u , int v ) {
        Graph.get(u).add(v) ;
        Graph.get(v).add(u) ;
    }

    // BTF tRAVERSAL
    public ArrayList traversal(int start  , ArrayList<Integer> ans ) {

        Queue<Integer> q  = new ArrayDeque<>( ) ;
        boolean [] visited = new boolean[vertex] ;
        q.add(start) ;
        visited[start] = true ;
        while ( ! q.isEmpty()) {
            int front  =  q.remove() ;
            ans.add(front) ;
            int size = q.size() ;
            for(int neighbor  : Graph.get(front) ) {
                if(! visited[neighbor]) {
                    visited[neighbor] = true  ;
                    q.add(neighbor) ;
                }
            }
        }
        return  ans  ;
    }

    // dfs Traversal
    public  ArrayList dfs ( int start , ArrayList<Integer>ans ) {
        boolean [] visited  = new boolean[vertex] ;
         dfsTraversal( start ,  ans , visited  ) ;
        return ans  ;
    }

   public  void  dfsTraversal ( int start , ArrayList<Integer>ans  , boolean visited [] ) {
       ans.add(start) ;
       visited[start] = true  ;
       for( int neighbor : Graph.get(start)) {
            if(! visited[neighbor] ) {
                dfsTraversal(neighbor , ans , visited ) ;
            }
        }

   }

    public static  void main (String [] agr ) {
       BFSTraversal bfs =  new BFSTraversal(5) ;
       bfs.add(0,1); ;
       bfs.add(0,2);
       bfs.add(1,3);
       bfs.add(2,4);
        System.out.println("BFS TRAVERSAL...........");
       ArrayList<Integer> ans   = new ArrayList<>() ;
       bfs.traversal(0 ,  ans  ) ;
       for( int val  : ans  ) {
           System.out.print(val  + " ");
       }
        System.out.println("\n  DFS TRAVERSAL..............");
         ArrayList<Integer> dfsAns  = new ArrayList<>() ;
         bfs.dfs(0 , dfsAns ) ;

         for( int val  : dfsAns) {
             System.out.print(val + " ");
         }
    }
}