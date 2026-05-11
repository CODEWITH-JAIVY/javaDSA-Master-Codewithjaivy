package miniMumSpaningtree;

import java.util.*;

public class KruskalAlgorithm {

    int[] parent;
    int[] rank;

    // Edge class
    static class Edge {
        int u, v, weight;

        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    public int kruskalAlgorithm(int n, List<Edge> edges) {

        parent = new int[n];
        rank = new int[n];

        // initialize
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        // sort edges
        edges.sort(Comparator.comparingInt(e -> e.weight));

        int totalWeight = 0;

        for (Edge e : edges) {

            if (find(e.u) != find(e.v)) {
                union(e.u, e.v);
                System.out.println( "Current w "+e.weight);
                totalWeight += e.weight;
            }
        }

        return totalWeight;
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private void union(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px == py) return;

        if (rank[px] > rank[py]) {
            parent[py] = px;
        } else if (rank[py] > rank[px]) {
            parent[px] = py;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {

        KruskalAlgorithm obj = new KruskalAlgorithm();

        int n = 9; // number of vertices

        List<Edge> edges = new ArrayList<>();

        // u, v, weight
        edges.add(new Edge(0, 1, 4));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 6));
        edges.add(new Edge(1, 2, 7));
        edges.add(new Edge(2, 8, 8));
        edges.add(new Edge(3, 4, 3));
        edges.add(new Edge(4, 6, 5));
        edges.add(new Edge(4, 5, 4));
        edges.add(new Edge(5, 6, 3));


        int mstWeight = obj.kruskalAlgorithm(n, edges);

        System.out.println("Minimum Spanning Tree Weight: " + mstWeight);
    }
}