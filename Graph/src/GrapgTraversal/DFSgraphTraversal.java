package GrapgTraversal;

import java.util.ArrayList;

// ===============================================
// DFS traversal with undireted Graph
// ===============================================

public class DFSgraphTraversal {

    int vertet;

    record edge(int v, int weigth) {
    }

    ArrayList<ArrayList<edge>> Graph;

    DFSgraphTraversal(int vertet) {
        this.vertet = vertet;
        Graph = new ArrayList<>();

        for (int i = 0; i < vertet; i++) {
            Graph.add(new ArrayList<>());
        }
    }

    public void add(int v, int u, int w) {
        Graph.get(v).add(new edge(u, w));
        Graph.get(u).add(new edge(v, w));

    }

    // print the conectino of the  vertex
    public void printDetail() {
        for (int i = 0; i < vertet; i++) {
            System.out.print(i + "-> ");
            for (edge e : Graph.get(i)) {
                System.out.print(e + " -> ");
            }
            System.out.println();
        }
    }

    // DFS TRAVERSAL
    public void DFSTraversal(int start) {
        boolean Visted[] = new boolean[vertet];
        System.out.println("DFS Traversal ");
        dfs(start, Visted);
    }

    public void dfs(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " - > ");

        for (edge e : Graph.get(node)) {
            int neighbor = e.v();
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }


    public static void main(String[] args) {
        DFSgraphTraversal g = new DFSgraphTraversal(5);

        g.add(0, 1, 1);
        g.add(0, 2, 1);
        g.add(1, 3, 1);
        g.add(2, 4, 1);

        g.printDetail();
        g.DFSTraversal(2);
    }
}