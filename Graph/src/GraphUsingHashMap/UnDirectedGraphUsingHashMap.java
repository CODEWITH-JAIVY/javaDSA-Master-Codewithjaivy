package GraphUsingHashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class UnDirectedGraphUsingHashMap {

     record edge( int v   , int weigth ) {}

     int vertext  ;
     // ========== IMPORTANT POINT  HOW TO CREATE HASHMAP GRAPH
     HashMap<Integer , ArrayList<edge> > Graph  ;

     UnDirectedGraphUsingHashMap( int vertext ) {
         this.vertext = vertext ;
          Graph = new HashMap<>() ;

          for (int i  =0 ; i < vertext ; i++ ) {
              Graph.put(i , new ArrayList<>()) ;
          }
     }
     public  void add( int u , int v , int w ) {
          Graph.get(v).add( new edge(u , w )) ;
          Graph.get(u).add(new edge(v , w )) ;
     }
    public void printGraph () {
        for (int i = 0; i <vertext ; i++) {
            System.out.print ( i + "->");
            for( edge e  : Graph.get(i)) {
                System.out.print(e + " -> ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UnDirectedGraphUsingHashMap  g  = new UnDirectedGraphUsingHashMap(3) ;
        g.add(0, 1, 10);
        g.add(0, 2, 20);
        g.add(1, 2, 30);
        g.printGraph();
    }
}