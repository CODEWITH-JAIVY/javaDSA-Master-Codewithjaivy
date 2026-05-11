package checkValidGridKnight2596;

public class checkValidGrid2 {
    public static boolean validCon(int[][] grid , int r ,int c , int ex , int N ) {
        if(r<0 || c <0  || r>N || c >N  ) {
            return false  ;
        }
        if( ex ==N*N-1 ) {
            return true ;
        }

        // 8 possible moves
        boolean  value1  = validCon( grid ,  r-2 , c+1 ,  ex+1 , N ) ;
        boolean  value2 =  validCon( grid ,  r-1 , c+2 ,  ex+1 , N );
        boolean  value3 =  validCon( grid ,  r+1 , c+2 ,  ex+1 , N ) ;
        boolean  value4 =  validCon( grid ,  r+2 , c+1 ,  ex+1 , N );
        boolean  value5 =  validCon( grid ,  r+2 , c-1 ,  ex+1 , N );
        boolean value6 =   validCon( grid , r+1 , c-2 ,  ex+1 , N) ;
        boolean  value7 =  validCon( grid , r-1  ,  c-2 ,  ex+1 , N ) ;
        boolean  value8 =  validCon( grid ,  r-2  ,c-1 ,  ex+1 , N ) ;

        return value1  || value2 ||value3|| value4 ||value5 ||value6 ||value7||value8  ;

    }

    public boolean checkValidGrid(int[][] grid) {
        boolean ans  = validCon( grid , 0 , 0 , 0  , grid.length) ;
        return ans  ;
    }
}
