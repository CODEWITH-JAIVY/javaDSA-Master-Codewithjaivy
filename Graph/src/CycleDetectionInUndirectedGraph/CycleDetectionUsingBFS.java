package CycleDetectionInUndirectedGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class  CycleDetectionUsingBFS {
      record  pair(int node , int parent  ) {}
    public boolean isCycle(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        for(int i  =0  ; i< V ;  i++   ) {
            if(! visited[i]) {
                Queue<pair> q  = new LinkedList<>() ;
                q.offer(new pair (i  , -1 )) ;
                visited[i] = true;
                while (!q.isEmpty() ) {
                    pair curr  = q.poll() ;
                    int node  = curr.node() ;
                    int parent  = curr.parent()  ;

                    for(int neighbor : graph.get(node)) {
                        if(! visited[neighbor]) {
                            visited[neighbor] = true  ;
                            q.offer(new pair (neighbor , node )) ;
                        } else if (neighbor != parent ) {
                            return  true  ;
                        }
                    }
                }
            }
        }
      return  false  ;
    }

    public static void main(String[] args) {

        CycleDetectionUsingBFS obj = new CycleDetectionUsingBFS();

        int V = 4;

        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 0}
        };

        boolean ans = obj.isCycle(V, edges);

        System.out.println("Cycle Present: " + ans);
    }
}