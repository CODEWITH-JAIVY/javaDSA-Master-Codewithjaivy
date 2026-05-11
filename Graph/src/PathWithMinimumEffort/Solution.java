package PathWithMinimumEffort;

import java.util.Arrays;
import java.util.PriorityQueue;


public  class Solution {
    public int minimumEffortPath(int[][] heights) {
        int row  = heights.length  ;
        int col  = heights[0].length  ;


        // Min-heap: {effort, row, col}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] - b[0]
        );

        int [][]dir  = {  {-1 , 0} ,  {0 ,1} ,  {1,0}   ,  {0,-1} } ;

        int [][] effor = new int [row][col ]  ;
        for (int i = 0; i < row; i++) {
            Arrays.fill(effor[i], Integer.MAX_VALUE);
        }
        pq.add( new int [] {0 , 0 , 0 }  ) ;
        effor  [0][0]  =  0  ;

        while(! pq.isEmpty ()  ) {
            int [] curr  = pq.poll ()  ;
            int curreffor  = curr[0] ;
            int r = curr[1] ;
            int c = curr[2]  ;

            if ( r == row-1  && c  == col -1  )  return  curreffor  ;

            for( int []n  : dir  ) {
                int nr  =r+ n[0] ;
                int nc  =c+ n[1]   ;

                if(nr >= 0 && nc >= 0  && nr< row  && nc < col  ) {
                    int diff  = Math.abs (heights[nr][nc] - heights[r][c] ) ;
                    int newEffor = Math.max( curreffor  , diff )   ;
                    if( newEffor < effor[nr][nc]) {
                        effor[nr][nc] =   newEffor ;
                        pq.add(new int[] { newEffor , nr , nc } )   ;
                    }
                }

            }

        }
        return  0  ;
    }
}