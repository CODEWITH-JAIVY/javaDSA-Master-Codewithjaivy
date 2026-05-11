public class problem3 {

    public static int fun( int n ) {
        if( n == 1  ) return  1 ;
         return  fun(n-1) + fun(n- 1) ;
    }

    public static void main(String[] args) {
        int n =  3  ;
        System.out.println(fun ( n ));
    }
}
