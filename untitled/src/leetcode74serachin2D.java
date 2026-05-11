public class leetcode74serachin2D {

        public  static  boolean searchMatrix(int[][] mat, int target) {
            int hrow = mat.length -1 ;
            if(hrow ==0  ) return false ;

            int row = 0 ;
            int start =0  ;
            for( int i = 0 ; i<hrow  ; i++ ) {

                int col =  mat[i].length -1  ;
                if( target > mat[i][col]) {
                    continue ;
                }
                while( start < col  ) {
                    int mid = start + ( col  - start ) / 2  ;
                    if( mat[i][col] == target  )  return true  ;
                    if( mat[i][mid] < target ) {
                        start  = mid+1  ;
                    }else  {
                        col = mid-1  ;
                    }
                }
            }
            return false  ;
        }

    public static void main(String[] args) {
        int [][]mat  = { {1,3,5,7},{10,11,16,20},{23,30,34,60} } ;
        System.out.println( searchMatrix(mat , 3 ));
    }
}
