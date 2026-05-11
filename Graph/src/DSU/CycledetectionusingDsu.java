package DSU;

import CycleDetectionforDisconnectedGraph.Solution;

// gfg  problem
public class CycledetectionusingDsu {
    int parent [] ;
    int rank[] ;

    public int find (int x ) {

        if(parent[x] != x ) {
            parent[x] = find(parent[x]) ;
        }
        return  parent [x ] ;
    }
    public  void union(int x, int y ) {

        int xp = find(x ) ;
        int yp  = find(y) ;

        if(xp  == yp ) return;

        if(rank[xp] < rank[yp]) {
            parent[xp] = yp  ;
        }else  if (rank[yp] < rank[xp]) {
            parent[yp] = xp  ;
        }else  {
            parent[xp] = yp  ;
        }
    }
    public boolean isCycle(int V, int[][] edges) {
        parent = new int[V] ;
        rank = new int[V] ;

        for (int i = 0; i <V ; i++) {
            parent[i] =  i  ;
            rank[i] =  0  ;
        }
        for (int i = 0; i <edges.length ; i++) {

            int v  = edges[i][0] ;
            int u = edges[i][1] ;

            int pv =  find (v ) ;
            int pu = find(u) ;

            if(pv == pu )  return  true   ;  // cylce found

            union(v , u  ) ;
        }

         return  false  ;
    }
    public static void main(String[] args) {

        int V = 4;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 2},
                {2, 3}
        };

        CycledetectionusingDsu obj = new CycledetectionusingDsu();
        boolean result = obj.isCycle(V, edges);

        if (result)
            System.out.println("Cycle exists");
        else
            System.out.println("No cycle");
    }

}