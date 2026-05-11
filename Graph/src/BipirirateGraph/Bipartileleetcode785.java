package BipirirateGraph;

import java.util.Arrays;

public class Bipartileleetcode785 {

    public boolean dfs ( int [][]graph , int node , int []color , int current ) {
        color[node] = current  ;


        for( int  neighbor  : graph[node]) {
            if(color[neighbor] == -1 ) {
                if( ! dfs ( graph , neighbor , color , 1-current )) {
                    return false  ;
                }
            }else if ( color[neighbor] == current ) {
                return false  ;
            }
        }
        return true  ;
    }
    public boolean isBipartite(int[][] graph) {
        int V = graph.length  ;

        int color[] = new int[V] ;

        Arrays.fill(color , -1 ) ;

        for( int i =0 ;i< V  ; i++ ) {
            if( ! dfs ( graph , i , color  , 0 )) {
                return false  ;
            }
        }
        return true  ;
    } 
}