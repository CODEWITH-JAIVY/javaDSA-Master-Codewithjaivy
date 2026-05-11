import java.util.HashMap;
import java.util.Map;

public class frequency {

    public  static int  mostfre( int [] arr ) {
        Map<Integer , Integer> fr = new HashMap<>() ;
        for( int val  : arr ) {
            if( fr.containsKey(val)) {
                fr.put(val, fr.get(val) + 1);
            }else {
                fr.put(val , 1 ) ;
            }
        }
        int maxFreq = 0;
        int mostFrequent = -1;

        for (var entry : fr.entrySet()) {
            if (entry.getValue() > maxFreq) {   // compare frequency
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();   // number with max frequency
            }
        }

        return mostFrequent ;
    }

    public static void main(String[] args) {
        int [] arr  = { 1,1,1,2,3,5,8,9} ;
        int res  = mostfre (arr) ;
        System.out.println(res  );
    }
}
