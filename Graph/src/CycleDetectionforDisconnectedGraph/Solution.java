package CycleDetectionforDisconnectedGraph;

import java.util.ArrayList;

public class Solution {

    // DFS helper
    public boolean cycle(
            ArrayList<ArrayList<Integer>> graph,
            boolean[] visited,
            int start,
            int parent
    ) {
        visited[start] = true;

        for (int neighbor : graph.get(start)) {
            if (!visited[neighbor]) {
                if (cycle(graph, visited, neighbor, start))
                    return true;
            } else if (neighbor != parent) {
                return true; // cycle detected
            }
        }
        return false;
    }

    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        // Handle disconnected graph
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (cycle(graph, visited, i, -1))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] edges = {
                {0, 1},
                {2, 3},
                {1,0}
        };

        Solution adj = new Solution();
        System.out.println(adj.isCycle(4, edges));
    }
}