package TopologicalDAG;

import java.util.ArrayList;
import java.util.Stack;

public class Topological {

    // DFS helper method
    private void dfs(int node,
                     ArrayList<ArrayList<Integer>> graph,
                     boolean[] visited,
                     Stack<Integer> stack
            ) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, stack);
            }
        }

        // Push node after visiting all neighbors
        stack.push(node);
    }

    // Topological sort method
    public ArrayList<Integer> topological(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize graph
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
        }

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        // Call DFS for each unvisited node
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, stack);
            }
        }

        // Store result
        ArrayList<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    // ===== DRIVER CLASS =====
    public static void main(String[] args) {

        Topological topo = new Topological();

        int V = 6;
        int[][] edges = {
                {5, 2},
                {5, 0},
                {4, 0},
                {4, 1},
                {2, 3},
                {3, 1}
        };

        ArrayList<Integer> result = topo.topological(V, edges);

        System.out.println("Topological Sort:");
        for (int node : result) {
            System.out.print(node + " ");
        }
    }
}