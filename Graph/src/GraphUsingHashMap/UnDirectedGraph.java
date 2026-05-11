package GraphUsingHashMap;

// ==============================================
//         graph  uisng  HashMap
//===============================================

import java.util.ArrayList;
import java.util.HashMap;

public class UnDirectedGraph {

    HashMap<Integer ,  ArrayList<Integer>  > Graph  ;
     int vertet  ;

     UnDirectedGraph( int vertet ) {
         this.vertet = vertet  ;
         Graph  = new HashMap<>() ;

         for (int i = 0; i <vertet; i++) {
             Graph.put(i , new ArrayList<>()) ;
         }
     }

     public void add ( int  u , int v ) {
         Graph.get(u).add(v) ;
         Graph.get(v).add(u) ;
     }

     public void print () {
         for (int val  : Graph.keySet()) {
             System.out.print( val+  "-- > ");
             for (int key  : Graph.get(val)) {
                 System.out.print (key + " --> ");
             }
             System.out.println();
         }
     }

       public void addvertex () {
           Graph.put(vertet , new ArrayList<>()) ;
           vertet++ ;
       }
    public static void main(String[] args) {
        UnDirectedGraph graph = new UnDirectedGraph(3 ) ;
        graph.add(0 , 1 );
        graph.add(0, 2 );
        graph.add(1,2 );

        graph.print();
        System.out.println(" ==============================================");
        graph.addvertex() ;
        graph.add(1,3);
        graph.print();
    }
}