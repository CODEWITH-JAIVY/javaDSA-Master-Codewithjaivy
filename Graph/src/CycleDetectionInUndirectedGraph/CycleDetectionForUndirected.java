package CycleDetectionInUndirectedGraph;

import java.util.ArrayList;

public class CycleDetectionForUndirected {
     int vertet  = 0 ;

    ArrayList<ArrayList<Integer>>Graph  = new ArrayList<>() ;

    CycleDetectionForUndirected(int vertet) {
        this.vertet = vertet ;

        for (int i = 0; i <vertet ; i++) {
            Graph.add(new ArrayList<>()) ;
        }

    }

    void add(int v , int u ) {
       Graph.get(u).add(v) ;
       Graph.get(v).add(u) ;
    }

    void displayDetail(){
        for (int i = 0; i <vertet ; i++) {
            System.out.print(i+ "->");
            for (int g : Graph.get(i)) {
                System.out.print(g + "->");
            }
            System.out.println();
        }
    }
    void DfsTraversal (int start ) {
        boolean visited[] = new boolean[vertet] ;
        Dfs( start,visited);
    }
    void Dfs(int start , boolean[]visites ) {
        visites[start] = true ;
        System.out.print(start+"-> ");

        for(int neight : Graph.get(start)) {
            if(! visites[neight]) {
                Dfs(neight , visites);
            }
        }

        System.out.println();
    }
   public boolean cycleDetection( int start ) {
       boolean[]visited =  new boolean[vertet] ;
       return cycle(start , visited , -1 ) ;
   }
    // cycle with DFS traversal
   public boolean cycle(int start   , boolean[]visited , int parent  ){
      visited[start ] =true ;

          for (int node : Graph.get(start)) {
              if (!visited[node]) {
                  if (cycle(node, visited, start)) return true;
              } else if (node != parent  ) { // just abhi jha se  aaye hai
               return true ;
              }
          }
         return false ;
   }
    public static void main(String[] args) {
        CycleDetectionForUndirected g = new CycleDetectionForUndirected(4) ;
        g.add(0,1);
        g.add(0,2);
        g.add(1,3);
        g.add(0,3);
        System.out.println("==================================================");
        System.out.println("Node connection ");
        g.displayDetail();
        System.out.println("===================================================");
        System.out.println("DFS Traversal ");
        g.DfsTraversal(1);
        System.out.println("====================================================");
        System.out.println("Cycle Detection ");
       boolean ans  =  g.cycleDetection(1);
        System.out.println( "Cycle Detected " + ans );
    }
}