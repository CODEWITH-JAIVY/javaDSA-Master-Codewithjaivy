package CycleDetectioninGraphByBFS;

import java.util.ArrayList;

public class cycleDEtectionInGraph {
    public static boolean bfs (ArrayList<ArrayList<Integer>> Graph,
                                boolean[] visited,
                                int start,
                                boolean[] recursion) {

        visited[start] = true ;
        recursion[start] = true ;

        for( int neighbor : Graph.get(start)) {
            if  ( ! visited[neighbor]) {
                recursion[neighbor] = true ;
                if(bfs (Graph , visited  , neighbor , recursion ))  return  true  ;
            }else if ( recursion[neighbor]) return  true ;
        }
        return  false ;
    }

    public static boolean DirectedisCycle(int V, int[][] edge) {
        ArrayList<ArrayList<Integer>> Graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            Graph.add(new ArrayList<>());
        }
        // build graph for the undirected Graph

        for (int e[] : edge) {
            int v = e[0];
            int u = e[1];
            Graph.get(v).add(u);
        }

        // for all the node witch is connected or not
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfs(Graph, visited, i, new boolean[V])) return true;
            }
        }
        return false;
    }
    // -------- DRIVER METHOD --------
    public static void main(String[] args) {

        int V = 5 ;
        int[][] edges = {
                {0, 1},
//                {1, 0},
                {1, 2},
//                {1, 3 },
                {2, 3},
                {3, 1}   // creates a cycle
        };

        if (DirectedisCycle(V, edges)) {
            System.out.println("Cycle exists in directed graph");
        } else {
            System.out.println("No cycle in directed graph");
        }
    }

}