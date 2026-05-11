public class PowerAfAnumber {


    public static int pow( int num , int p ) {
        if( p == 0) { return 1 ; }
        return  num* pow(num   , p-1 ) ;
    }
    public static void main(String[] args) {
     int res  = pow( 2 , 5 ) ;
        System.out.println(res);
    }
}
