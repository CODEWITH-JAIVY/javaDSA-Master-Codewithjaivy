package cycleDetectionInDirectedGraph;



import java.util.ArrayList;


public class cycleInUndirectedGraph {
    public boolean cycle ( ArrayList<ArrayList<Integer>>graph ,
                           boolean[]visited ,
                           int node ,
                           boolean []recustion
    ) {

        visited[node] = true ;
        recustion[node] = true  ;

        for (int neighbor : graph.get(node)) {
            if(!visited[neighbor]) {
                if(cycle(graph , visited , neighbor , recustion )) return  true ;
            }else if (! recustion [neighbor]) return  true  ;
        }
        recustion[node] = false ;;
        return  false  ;
    }


    public boolean isCycle(int V, int[][] edge) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i =0 ; i < V  ;i++ ) {
            graph.add(new ArrayList<>()) ;
        }

        // build graph
        for(int []e  : edge  ) {
            graph.get(e[0]).add(e[1]) ;
        }

        boolean [] visited = new boolean[V] ;

        for (int i = 0; i <V ; i++) {
            if (! visited[i]){
                if (cycle ( graph , visited , i , new boolean[V] )) return  true  ;
            }
        }
        return false  ;
    }

    public static void main(String[] args) {

cycleInUndirectedGraph cheak  = new cycleInUndirectedGraph() ;
        int[][] edges = {
                {0, 1},
//                {1, 0},
                {1, 2},
//                {1, 3 },
                {2, 3},
                {3, 1}   // creates a cycle
        };
        System.out.println("Cycle detection ");
        System.out.println(cheak.isCycle(4 , edges)) ;
    }
}