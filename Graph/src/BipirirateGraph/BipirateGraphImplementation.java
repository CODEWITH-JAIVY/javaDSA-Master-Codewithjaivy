package BipirirateGraph;

import java.util.ArrayList;
import java.util.Arrays;

public class BipirateGraphImplementation {
    public boolean  dfs (  ArrayList<ArrayList<Integer>> graph ,
                           int node ,
                           int currColor  ,
                           int [] color ) {
        color[node] = currColor ;

        for(int  neighbor   : graph.get(node)) {
            if(color[neighbor] == -1 ) {
                if( !   dfs(graph , neighbor , 1- currColor  , color )) {
                    return false;
                }
            }else if (color[neighbor] == currColor ) {
                return false ;
            }
        }

      return  true ;

    }

    public boolean isBipartiteGraph(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int e[] : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        int color[] = new int[V];
        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!dfs(graph, i, 0, color)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        BipirateGraphImplementation obj = new BipirateGraphImplementation();

        int V = 5;
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 0} ,
                {3,2} ,
                {4,1 }
        };

        System.out.println(obj.isBipartiteGraph(V, edges));
    }
}