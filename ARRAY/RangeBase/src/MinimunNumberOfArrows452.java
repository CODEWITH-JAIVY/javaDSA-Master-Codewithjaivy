import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MinimunNumberOfArrows452 {
    public int findMinArrowShots(int[][] points)
    {

         int n  =  points.length  ;
        if(n ==1  ) {
            return  0  ;
        }

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));


        int prev [] = new int [2] ;
        prev[0] = points[0][0] ;
        prev[1] = points[0][1] ;
         int arrowCount   =  1 ;
        for(int  i  =1  ; i < n  ; i++  ) {
            int currStart  = points[i][0] ;
            int currEnd  =  points[i][1]  ;
             // no overLap  condition
            if(currStart >  prev[1] ) {
                arrowCount ++ ;
                prev[0] = currStart ;
                prev[1] = currEnd  ;
            }else  {
                 prev[0] = Math.max(currStart , prev[0 ] ) ;
                 prev[1] = Math.min(currEnd , prev[1] ) ;

            }

        }
        return  arrowCount  ;
    }

    public static void main(String[] args) {

        int[][] points = {
                {1, 3 },
                {3, 4},
                {5, 6},
                {7, 8}
        };


        MinimunNumberOfArrows452 obj  = new MinimunNumberOfArrows452() ;
        int arrowAsn  =  obj.findMinArrowShots(points ) ;
        System.out.println( "Required Number of arrow "+ arrowAsn );
    }
}