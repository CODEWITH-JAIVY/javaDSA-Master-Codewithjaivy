package BipirirateGraph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class BipirateGraphUsingBFS {
    public boolean bfs (
            ArrayList<ArrayList<Integer>>graph ,
                int node  ,
            int []color ,
            int currColor  ) {

        Queue<Integer> queue = new ArrayDeque<>() ;
        queue.add(node) ;
        color[node] = currColor ;

        while (! queue.isEmpty()) {
            int curr = queue.poll() ;

            for( int neighbor  : graph.get(curr)) {
                if(color[neighbor] == -1 ){
                    if( ! bfs( graph , neighbor , color , 1 - currColor )) return false ;
                }else  if ( color[neighbor] == currColor ) {
                    return false ;
                }
            }
        }
        return true ;
    }

    public boolean isBipartiteGraph(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        // build graph
        for (int e[] : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        int color[] = new int[V];

        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!bfs(graph, i, color, 0)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BipirateGraphUsingBFS obj = new BipirateGraphUsingBFS();

        int V = 5;
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 0},
                {3, 1},
                {4, 1}
        };

        System.out.println(obj.isBipartiteGraph(V, edges));
    }
}