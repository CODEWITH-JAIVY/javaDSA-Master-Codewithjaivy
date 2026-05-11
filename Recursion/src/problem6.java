public class problem6 {

    public static int fun( int n ) {
        if( n <= 1 ) return  1  ;
        return fun( n -1 ) + fun(n-2 ) ;
    }
    public static void main(String[] args) {
        int n = 4  ;
        System.out.println(fun(n));
    }
}
