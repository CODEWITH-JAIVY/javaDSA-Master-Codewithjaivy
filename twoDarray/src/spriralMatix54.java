import java.util.ArrayList;
import java.util.List;

public class spriralMatix54 {


        public static List<Integer> spiralOrder(int[][] matrix) {
            // four boundary
            int scol  = 0  , srow =0 ;
            int erow = matrix.length -1  ;
            int ecol = matrix[0].length-1 ;

            List<Integer>ans  = new ArrayList<>() ;

            while( scol <= ecol && srow<=erow ) {
                // top
                for(int i = scol ; i <= ecol ; i++ ) {
                    ans.add(matrix[srow][i]) ;

                }

                // rigth
                for( int i =srow+1 ; i<=erow ; i++) {
                    ans.add(matrix[i][ecol]) ;
                }
                // buttom

                for(int i = ecol-1 ; i>=scol ; i-- ) {
                    if(scol == ecol) {
                        break ;  // corner case if the buttom and top bounder is on the same conditio
                    }
                    ans.add(matrix[erow][i]) ;
                }

                // left
                for( int i = erow-1 ; i>= srow ; i--) {
                    if(srow == erow ) { break ;}
                    ans.add(matrix[i][srow]) ;
                }
                scol++ ;
                srow++ ;
                erow-- ;
                ecol-- ;
            }
            return ans  ;
        }




    public static void main(String[] args) {
        int [][]mtrix = { {1,2,3,4} ,{5,6,7,8} , {9,10,11,12} , {13,14,15,16} } ;
        List<Integer>result = new ArrayList<>() ;
        result = spiralOrder(mtrix) ;
        System.out.println(result); ;
    }
}
