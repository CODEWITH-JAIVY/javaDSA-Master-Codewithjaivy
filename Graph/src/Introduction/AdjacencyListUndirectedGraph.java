package Introduction;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class AdjacencyListUndirectedGraph {

    int vertex;
    ArrayList<ArrayList<Integer>> list;

    // ============ CONSTRUCTOR =================
    AdjacencyListUndirectedGraph(int vertex) {
        this.vertex = vertex;
        list = new ArrayList<>();

        for (int i = 0; i < vertex; i++) {
            list.add(new ArrayList<>());
        }
    }

    // ========== FOR UNDIRECTED GRAPH ===========
    public void add(int v, int u) {
        list.get(v).add(u);
        list.get(u).add(v);
    }

    // ========== PRINT GRAPH ====================
    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print(i + " -> ");
            for (int adj : list.get(i)) {
                System.out.print(adj + " ");
            }
            System.out.println();
        }
    }
    private void BFS(int start) {
        boolean[] visited = new boolean[vertex];
        Queue<Integer> q = new ArrayDeque<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int adj : list.get(curr)) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    q.add(adj);
                }
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyListUndirectedGraph graph = new AdjacencyListUndirectedGraph(5);
        graph.add(0, 1);
        graph.add(0, 4);
        graph.add(1, 2);
        graph.add(1, 3);
        graph.add(1, 4);
        graph.add(2, 3);
        graph.add(3, 4);

        graph.printGraph();
        graph.BFS(3 );
//        graph.printGraph();

    }

}