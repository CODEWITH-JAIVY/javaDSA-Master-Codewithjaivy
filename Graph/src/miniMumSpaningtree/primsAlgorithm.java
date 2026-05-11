package miniMumSpaningtree;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class primsAlgorithm {

    record Edge(int vertex, int weight) {}

    public static int minSapning(ArrayList<ArrayList<Edge>> graph,
                                 int ver,
                                 boolean[] visited,
                                 PriorityQueue<Edge> pq,
                                 int startNode) {

        pq.add(new Edge(startNode, 0));
        int result = 0;

        while (!pq.isEmpty()) {
            Edge eg = pq.poll();

            if (visited[eg.vertex]) continue;

            visited[eg.vertex] = true;
            result += eg.weight;

            for (Edge e : graph.get(eg.vertex)) {
                if (!visited[e.vertex]) {
                    pq.add(new Edge(e.vertex, e.weight));
                }
            }
        }
        return result;
    }

    public int miniMunSpaning(ArrayList<ArrayList<Edge>> graph, int ver, int start) {

        boolean[] visited = new boolean[ver];

        PriorityQueue<Edge> pq = new PriorityQueue<>(
                (a, b) -> a.weight - b.weight
        );


        return minSapning(graph, ver, visited, pq, start);
    }
    public static void main(String[] args) {

        int V = 5; // number of vertices

        ArrayList<ArrayList<primsAlgorithm.Edge>> graph = new ArrayList<>();

        // initialize graph
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // add edges (undirected graph)
        addEdge(graph, 0, 1, 2);
        addEdge(graph, 0, 3, 6);
        addEdge(graph, 1, 2, 3);
        addEdge(graph, 1, 3, 8);
        addEdge(graph, 1, 4, 5);
        addEdge(graph, 2, 4, 7);
        addEdge(graph, 3, 4, 9);

        primsAlgorithm obj = new primsAlgorithm();

        int mstCost = obj.miniMunSpaning(graph, V, 0);

        System.out.println("Minimum Spanning Tree Cost: " + mstCost);
    }

    // helper method to add undirected edge
    static void addEdge(ArrayList<ArrayList<primsAlgorithm.Edge>> graph,
                        int u, int v, int w) {

        graph.get(u).add(new primsAlgorithm.Edge(v, w));
        graph.get(v).add(new primsAlgorithm.Edge(u, w));
    }
}