package DirectAndUndirectedGrap;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

// ============== BFS for the un directed Traversal  ===================
public class BFStraversalUndirected {

    ArrayList<ArrayList<Integer>> Graph = new ArrayList<>();
    int vertex = 0;

    BFStraversalUndirected(int vertex) {
        this.vertex = vertex;

        for (int i = 0; i < vertex; i++) {
            Graph.add(new ArrayList<>());
        }
    }

    public void add(int v, int u) {
        Graph.get(v).add(u);
//        Graph.get(u).add(v) ;
    }

    void nodeDetail() {
        for (int i = 0; i < vertex; i++) {
            System.out.print(i + " -> ");
            for (int node : Graph.get(i)) {
                System.out.print(node + " -> ");
            }
            System.out.println();
        }
    }

    // ================TRAVERSAL FOR THE UNDIRECTED============
    public void BfsTraversal(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[vertex];
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {

            int cur = q.remove();
            System.out.print(cur + " -> ");
            for (int neighbor : Graph.get(cur)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }

        }
    }

    public static void main(String[] args) {
        BFStraversalUndirected g = new BFStraversalUndirected(3);
        g.add(0, 1);
        g.add(0, 2);
        g.add(1, 2);
        System.out.println("Node Connection  ");
        g.nodeDetail();
        System.out.println("Graph Traversal ");
        g.BfsTraversal(0);

    }
}