package StronglyConnectedComponent;

import java.util.*;

public class kasariyajAlgorithm {

    // Step 1: DFS to fill stack (based on finishing time)
    public static void dfs(ArrayList<ArrayList<Integer>> graph,
                           boolean[] visited,
                           Stack<Integer> stack,
                           int node) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, visited, stack, neighbor);
            }
        }

        stack.push(node); // push after visiting all neighbors
    }

    // Step 3: DFS on reversed graph
    public static void dfsReverse(ArrayList<ArrayList<Integer>> graph,
                                  boolean[] visited,
                                  int node) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfsReverse(graph, visited, neighbor);
            }
        }
    }

    public static int StronglyConnected(int[][] edge, int vertex) {

        // Step 0: Build graph (DIRECTED)
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] u : edge) {
            graph.get(u[0]).add(u[1]);
        }

        // Step 1: Fill stack
        boolean[] visited = new boolean[vertex];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < vertex; i++) {
            if (!visited[i]) {
                dfs(graph, visited, stack, i);
            }
        }

        // Step 2: Reverse graph
        ArrayList<ArrayList<Integer>> reverse = new ArrayList<>();

        for (int i = 0; i < vertex; i++) {
            reverse.add(new ArrayList<>());
        }

        for (int[] u : edge) {
            reverse.get(u[1]).add(u[0]); // reverse edge
        }

        // Step 3: Process stack and count SCC
        visited = new boolean[vertex];
        int count = 0;

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                count++;
                dfsReverse(reverse, visited, node);
            }
        }

        return count;
    }

    // ✅ Driver Code
    public static void main(String[] args) {

        int vertex = 5;

        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 0},
                {1, 3},
                {3, 4}
        };

        int result = StronglyConnected(edges, vertex);

        System.out.println("Number of Strongly Connected Components: " + result);
    }
}