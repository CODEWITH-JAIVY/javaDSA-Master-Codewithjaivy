package DirectAndUndirectedGrap;

import java.util.ArrayList;

public class undirectedWithWeigthGraph {

    record  edge (int ver , int weight ) {}

    int vertext ;
    ArrayList<ArrayList<edge>> list  ;
    // CONSTRUCTOR
     undirectedWithWeigthGraph(int vertext ) {
        this.vertext = vertext ;
        list = new ArrayList<>() ;

        for( int  i  =0 ; i<vertext ; i++ ) {
            list.add(new ArrayList<>()) ;
        }
     }

     // ADD METHOD
    public  void add( int  u , int v  , int weight  ) {
        list.get(u).add(new edge(v , weight));
        list.get(v).add(new edge(u ,weight )); // remove this line than it will be make this directed graph
    }

    public  void print ( ) {
        for (int i = 0; i < vertext ; i++) {
            System.out.print( i + "-> ");
            for( edge e  : list.get(i)) {
                System.out.print (e +" -> ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        undirectedWithWeigthGraph  g  = new undirectedWithWeigthGraph(3 );
        g.add(0,1,10 );
        g.add(0,2 , 20 );
        g.add(1,2,30);
        g.print();

    }

}