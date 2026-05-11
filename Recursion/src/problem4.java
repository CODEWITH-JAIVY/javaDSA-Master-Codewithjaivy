public class problem4 {
//    int a = 0 ;
    public  int fun( int  n  ) {
        int  a = 0 ;
        if( n == 0 ) return  0 ;
        a ++ ;
        return  fun(n-1) + a  ;
    }
    public static void main(String[] args) {
        int n = 5 ;
        problem4 ob  = new problem4() ;

        System.out.println(ob.fun(n ));
    }
}
