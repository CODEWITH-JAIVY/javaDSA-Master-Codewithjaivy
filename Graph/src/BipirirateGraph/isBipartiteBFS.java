package BipirirateGraph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class isBipartiteBFS {
    public boolean isBipartite(int[][] graph) {
        int len  = graph.length  ;
        int []color   = new int  [len ] ;
        Arrays.fill(color , -1 ) ;

        Queue<Integer> q  = new ArrayDeque<>() ;

        for( int i = 0 ; i< len  ; i++ ) {
            if( color [i]== -1 ) {
                q.offer(i) ;
                color[i] =  0 ;

                while(!q.isEmpty() ) {
                    int node = q.remove () ;

                    for( int neighbor : graph[node]) {
                        if( color[neighbor] == -1 ) {
                            color[i] = 1 - color[node] ;
                        }else if( color[node] == color [neighbor]) {
                            return false  ;
                        }
                    }
                }
            }

        }
        return true ;
    }
}