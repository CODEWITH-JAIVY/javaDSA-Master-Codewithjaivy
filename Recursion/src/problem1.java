public class problem1 {

    public static int  fun( int n ) {
        if( n == 0  ) return 0 ;
        System.out.println("n =" + n );
         return   fun(n-1);

    }

    public static void main(String[] args) {
        int n  =  3  ;
        fun(n) ;
    }
}
