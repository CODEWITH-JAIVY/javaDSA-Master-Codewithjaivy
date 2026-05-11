package findRedundantConnection684;

import java.util.ArrayList;

public class Solution {
//    public boolean dfs(ArrayList<ArrayList<Integer>> graph,
//                       int source,
//                       int destination,
//                       boolean[] visited) {
//        visited[source] = true;
//
//        for (int neighbor : graph.get(source)) {
//            if (neighbor == destination) {
//                return true;
//            }
//            if (!visited[neighbor]) {
//                dfs(graph, neighbor, destination, visited);
//            }
//        }
//        return false;
//    }
//
//    public int[] findRedundantConnection(int[][] edges) {
//        int n = edges.length;
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            graph.add(new ArrayList<>());
//        }
//        for (int[] e : edges) {
//            int a = e[0] - 1;
//            int b = e[1] - 1;
//            boolean visited[] = new boolean[n];
//            if (dfs(graph, a, b, visited)) {
//                return new int[]{e[0], e[1]};
//            }
//            graph.get(a).add(b);
//            graph.get(b).add(a);
//        }
//        return new int[0];
int rank[] ={} ;
    int parent[]={}  ;

    public int find ( int child  ) {
        if( parent[child] != child )  {
            parent [child ]  =   find   (parent [child] ) ;
        }
        return parent[child]   ;
    }
    public void  union (int  x ,int  y   )  {

        int px = find (x ) ;
        int py  = find ( y ) ;

        if( parent [px] == parent [py]) return  ;

        if( rank[px] > rank[py]) {
            parent[py] = px  ;
        }else if (rank[py] > rank[px]) {
            parent[px] = py  ;
        } else  {
            parent[px] = py ;
            rank[py] ++ ;
        }


    }
    public int[] findRedundantConnection(int[][] edges) {


        int n = edges.length  ;

        for( int i =0 ;i< n ; i++ ) {
            rank[i] = 0  ;
            parent[i] =  i  ;
        }

        for( int []e  : edges ) {
            int a  = e[0] ;
            int b = e[1] ;

            if(parent[a] == parent[b]) {
                return new int [] { e[0] , e[1]} ;
            }
            union ( a , b  ) ;
        }
        return new int [0] ;
    }
}