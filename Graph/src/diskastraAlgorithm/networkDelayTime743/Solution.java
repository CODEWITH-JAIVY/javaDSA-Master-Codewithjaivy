package diskastraAlgorithm.networkDelayTime743;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<ArrayList<int[]>> graph  = new ArrayList<>() ;
        for( int i = 0 ; i<= n  ; i++ ) {
            graph.add(new ArrayList<>()) ;
        }
        for( int [] e : times ) {
            graph.get(e[0]).add(new int[]{e[1] , e[2 ]}) ;
        }

        int [] networkDelay   = new int[n+1] ;
        Arrays.fill(networkDelay , Integer.MAX_VALUE );

        networkDelay[k] =  0  ;

        PriorityQueue<int[]> pq  = new PriorityQueue<>( (a , b ) ->
                a[0]-b[0]
        ) ;
        pq.add( new int[]{ 0 ,  k  }) ;

        while(!pq.isEmpty() ) {
            int [] curr = pq.poll() ;
            int v  = curr[1] ;
            int dist = curr[0] ;
            for( int e[]  : graph.get(v)) {
                int u  = e[0] ;
                int w = e[1 ] ;

                if (dist > networkDelay[v]) continue;

                if( dist  + w < networkDelay[u] ) {
                    networkDelay[u] = dist  + w ;
                    pq.add(new int [] {networkDelay[u] , u  }) ;
                }
            }
        }
        int max  = 0  ;
        for( int i =1 ; i<= n   ; i++ ) {
            if(networkDelay[i] == Integer.MAX_VALUE)  return  -1  ;
            max  = Math.max(max , networkDelay[i]) ;
        }
        return max  ;
    }
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[][] times = {
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };

        int n = 4;  // number of nodes
        int k = 2;  // starting node

        int result = sol.networkDelayTime(times, n, k);

        System.out.println("Network Delay Time: " + result);
    }
}