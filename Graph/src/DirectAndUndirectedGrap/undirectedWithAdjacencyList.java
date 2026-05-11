package DirectAndUndirectedGrap;

import java.util.ArrayList;

//===========================================
//         UNDIRECTED GRAPH
//===========================================
public class undirectedWithAdjacencyList {

    ArrayList<ArrayList<Integer>> list ;
    int vertex  ;

    undirectedWithAdjacencyList( int vertex ) {
        this.vertex = vertex ;
        list = new ArrayList<>() ;

        //======================================================
        //     MISTAKE  TO CREATE THE ARRAY OR ARRAY
        // ===============================================

        for(int i  =0 ;i < vertex ; i++ ) {
           list.add(new ArrayList<>() ) ;
        }
    }
     public  void add( int v , int u ) {
        list.get(v).add(u) ;
        list.get(u).add(v) ; // REMOVE THIS THAN IT WILL BE DIRECTED GRAPH
     }

     public void print () {
         for (int i = 0; i <vertex; i++) {
             System.out.println("-> ");
             for ( int val : list.get(i)) {
                 System.out.print (val + " -> ");
             }
             System.out.println();
         }
     }

    public static void main(String[] args) {
        undirectedWithAdjacencyList g = new undirectedWithAdjacencyList(3) ;
        g.add(0 , 1);
        g.add(0,2);
        g.add(1,2);
        g.print();
    }
}