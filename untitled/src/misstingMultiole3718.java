import java.util.ArrayList;
import java.util.Collections;

public class misstingMultiole3718 {

    public static int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> temp  = new ArrayList<>() ;

        for( int val  : nums  ) {
            if( val  %  k  == 0 ) {
                temp.add(val ) ;
            }
        }
        Collections.sort(temp) ;
        for( int i=1  ; i<= temp.size() ; i++ ) {
            if( k*i != temp.get(i-1) ) return i *k ;
        }
        int  len = temp.size()+1 ;
        return len *  k  ;
    }

    static void main() {
         int [] num  = {8,2,3,4,6} ;
         int ans = missingMultiple(num , 2 ) ;
        System.out.println(ans);
    }
}