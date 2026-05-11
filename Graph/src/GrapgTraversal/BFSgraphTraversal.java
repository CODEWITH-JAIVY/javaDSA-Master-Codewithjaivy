package GrapgTraversal;
// ==========================================================
//  UNDIRECTED GRAPH USING ARRAYSlIST AND TRAVERSAL BFS
//===========================================================
import java.util.*;
public class BFSgraphTraversal {
    record edge (int v , int weigth ) {}
   ArrayList<ArrayList<edge>> Graph  ;
    int vertex  ;

    BFSgraphTraversal( int vertex  ) {
        this.vertex = vertex ;
        Graph  = new ArrayList<>() ;

        for( int i  = 0 ; i< vertex  ; i++ ) {
            Graph.add(i , new ArrayList<>( )) ;
        }
    }

    public void add (int v , int u , int weigth ) {
        Graph.get(v).add(new edge(u , weigth)) ;
        Graph.get(u).add(new edge(v , weigth)) ;
    }

    public void PrintDetail () {
        System.out.println(" Graph Edge Connextion list ");
        for (int i = 0; i < vertex ; i++) {
            System.out.print("-> ");
            for( edge e  : Graph.get(i)) {
                System.out.print(e + " -> ");
            }
            System.out.println();
        }
    }

    // BFS TRAVERSAL
    public void BfsTraversal ( int  start  ) {
        Queue<Integer>q  = new ArrayDeque<>() ;
        boolean  visited [] = new boolean[vertex] ;
        visited[start] = true  ;
        q.add(start) ;

        while (! q.isEmpty()) {
            int front  = q.remove() ;
            System.out.print (front + " ");
            int  size = q.size() ;
            visited[front] = true  ;
           for( edge e  : Graph.get(front)) {
               int neigghbor = e.v() ;
               if(!visited[neigghbor]) {
                   visited[neigghbor] = true ;
                   q.add(neigghbor) ;
               }
           }

        }
    }

    public static void main(String[] args) {
        BFSgraphTraversal g = new BFSgraphTraversal(5);

        g.add(0, 1, 1);
        g.add(0, 2, 1);
        g.add(1, 3, 1);
        g.add(2, 4, 1);

        g.PrintDetail();
        g.BfsTraversal(0) ;
    }
}