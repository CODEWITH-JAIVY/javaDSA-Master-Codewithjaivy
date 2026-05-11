import java.util.ArrayDeque;
import java.util.Queue;

public class maxProfit121 {
    public static int maxProfit(int[] p) {
        int profit  = Integer.MIN_VALUE ;
        int buy  = p[0] ;
        int sell = 0 ;

        for( int  val  : p ) {

            if(val < buy ) {
                buy  = val  ;
                sell = val  ;
            }
            if(sell < val ) sell = val  ;

            int curr  = sell - buy;

            if(curr > profit ) profit = curr  ;

        }
        return  profit  ;

    }

    static void main() {
        int [] arr = { 7,1,5,3,6,4} ;
        int res  = maxProfit(arr) ;
        System.out.println(res);
//        System.out.println(1 ^ 2 ^ 3 ^ 4^1^4   );
    }
}