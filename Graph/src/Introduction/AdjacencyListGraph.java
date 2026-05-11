package Introduction;

import java.util.ArrayList;

public class AdjacencyListGraph {
//    class edge {
//        int vertex ;
//        int weight ;
//        edge(int vertex , int weight ) {
//            this.vertex = vertex ;
//            this.weight = weight ;
//        }
//    }
    record edge(int vertex, int weight) {}

    int vertexes ;
    private ArrayList<ArrayList<edge>> adlist  ;

    AdjacencyListGraph(int vertexes ) {
        this.vertexes = vertexes ;
         adlist = new ArrayList<>() ;

         for (int i  =0 ; i < vertexes ; i++ ) {
             adlist.add(new ArrayList<>() ) ;
         }
    }
    // =============================================================
    //       // Undirected graph
    // ===============================================================

    private void addEdge( int u , int v , int weight ) {
        adlist.get(u).add(new edge(v , weight)) ;
        adlist.get(v).add(new edge(u , weight)) ;
    }

    private void printGraph () {
        for( int i  = 0 ; i< vertexes ; i++ ) {
            System.out.println("--> ");
            for( edge e : adlist.get(i)) {
                System.out.print("(" + e.vertex + ", " + e.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyListGraph  g = new AdjacencyListGraph (3) ;
        g.addEdge(0, 1, 10);
        g.addEdge(0, 2, 20);
        g.addEdge(1, 2, 30);

        g.printGraph();
    }
}