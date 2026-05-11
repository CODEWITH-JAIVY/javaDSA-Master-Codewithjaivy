package TopologisortKAHNSALGORITHM;
import java.util.*;

public class KahnsAlgorithm {

    public ArrayList<Integer> topologicalSortKahnsAlgorithm(int V, int[][] edges) {
            ArrayList<ArrayList<Integer>> graph  = new ArrayList<>() ;
            ArrayList<Integer>ressult  = new ArrayList<>() ;

          // graph build
              for( int  i =0 ; i< V ; i++ ) {
                graph.add(new ArrayList<>()) ;
            }
           for (int e[] : edges ) {
            graph.get(e[0]).add(e[1]) ;
            }

           // inDregee
        int[]inDegree = new int[V] ;
        for (int i = 0; i <V ; i++) {
            for (int neighbor  : graph.get(i)) {
                inDegree[neighbor] ++ ;
            }

        }

        Queue<Integer>queue = new ArrayDeque<>() ;
         // insert all the node witch node inDegree is already is 0
         for(int i = 0 ; i< V  ; i++ ) {
             if(inDegree[i] == 0 ) {
                 queue.add(i) ;
             }
         }

         // using the bsf
        while (!queue.isEmpty()) {
            int node = queue.poll();
            ressult.add(node) ;

            for (int neigbor  : graph.get(node) ) {
                inDegree[neigbor] -- ;
                if(inDegree[neigbor] == 0 ) {
                    queue.add(neigbor) ;
                }
            }
        }

        // is the queue  size  is equal to the V there is no cycle
        //  if there is no equal to the size of the V
        if(V != ressult.size() ) {
            System.out.println("Cycle is detected ");
        }

            return  ressult ;
    }

    public static void main(String[] args) {
        int V = 7;
        int[][] edges = {
                {5, 2},
                {5, 0},
//                {0,5} ,
                {4, 0},
                {4, 1},
                {2, 3},
                {3, 1}


        };

        KahnsAlgorithm kn = new KahnsAlgorithm();
        System.out.println(kn.topologicalSortKahnsAlgorithm(V, edges));
    }
}