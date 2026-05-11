package CycleDetectionByDSU;

import java.util.ArrayList;

public class Solution {
    int rank []    ;
    int parent  [] ;

    public int find (int x ) {

        if(parent[x] != x ) {
            parent[x] = find(parent[x]) ;
        }
        return  parent[x] ;
    }

    public void union ( int x ,int y ) {

        int px  = find(x) ;
        int py  = find(y ) ;
        if(px == py ) return;

        if(rank[px] > rank[py]) {
            parent[py] = px ;
        }else  if   ( rank[py] > rank[px]) {
            parent[px] = py  ;
        } else   {
            parent[px] = py  ;
            rank[py] ++   ;
        }

    }
    public boolean CycleDetection(ArrayList<ArrayList<Integer>> graph ) {
        int n  = graph.size() ;
        rank = new int[ n ] ;
        parent  = new int[n] ;

        for( int i =0 ; i< n ; i++ ) {
            rank[i] = 0  ;
            parent[i] = i  ;
        }

        for( int u =0 ; u< n ; u++) {
            for( int v  : graph.get(u)) {
                // avoid  duplicated checking
                if(  v  <  u ) {
                    int pu  = find(u) ;
                    int pv  = find(v) ;

                    if(pu == pv ) {
                        return  true ;
                    }
                union(u , v );
                }
            }
        }
      return  false  ;  // no cycle detected
    }

    public static void main(String[] args) {


            // Create graph (Adjacency List)
            int n = 3;
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }

            // Example: 0-1, 1-2, 2-0 (Cycle exists)
            graph.get(0).add(1);
            graph.get(1).add(0);

            graph.get(1).add(2);
            graph.get(2).add(1);

            graph.get(2).add(0);
            graph.get(0).add(2);

            // Create Solution object
            Solution sol = new Solution();

            // Check cycle
            boolean hasCycle = sol.CycleDetection(graph);

            if (hasCycle) {
                System.out.println("Cycle Detected");
            } else {
                System.out.println("No Cycle");
            }
        }
    }