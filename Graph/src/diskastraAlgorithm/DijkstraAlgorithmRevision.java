package diskastraAlgorithm;

import java.util.*;

public class DijkstraAlgorithmRevision {

    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int vertex;
        int dist;

        Node(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node other) {
            return this.dist - other.dist;
        }
    }

    public static void dijkstraAlgorithm(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int u = cur.vertex;

            // Skip outdated entry
            if (cur.dist > dist[u]) continue;

            for (Edge neighbour : graph.get(u)) {
                int v = neighbour.to;
                int weight = neighbour.weight;
               ///    THIS IS KNOW   RELAXATION
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        // Print result
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < n; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }
}