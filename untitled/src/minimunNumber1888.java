public class minimunNumber1888 {
    public  static  int minFlips(String s) {
        int len  = s.length() ;

        s = ( s +s ) ;  // appennd for the linear type one operation

        String s1 = "" ;
        String s2 ="" ;

        for( int i =0 ;i< len* 2 ; i++ ) {
            s1 += (i%2==0 ? '1' : '0') ;
            s2 += (i%2 == 1 ? '0' : '1') ;
        }

        int result  = Integer.MAX_VALUE;
        int flip1 =  0  ;
        int flip2  =0  ;

        // sliding window ke liye
        int i  =0 ;
        int j  =0 ;
        while( j < 2 * len ) {
            if(s.charAt(j)!= s1.charAt(j)) {
                flip1 ++ ;
            }
            if(s.charAt(j) != s2.charAt(j)) {
                flip2 ++ ;
            }

            // shring part
            if(j-i+1 > len ) {
                if(s.charAt(i)!= s1.charAt(i)) flip1--  ;
                if(s.charAt(i) != s2.charAt(i)) flip2 --  ;

                if(j-i+1 == len ) {
                    result = Math.min(result , Math.min(flip1 , flip2) ) ;
                }
            }
            j++ ;
        }
        return result  ;
    }

    public static void main(String[] args) {
        System.out.println(minFlips("0101010001"));
    }
}