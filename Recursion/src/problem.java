public class problem {

    public  static int  Mystr( int n ) {
        if( n == 0 )  return  0 ;
        return  Mystr(n-1)+n ;
    }
    public static void main(String[] args) {
        int n =  4  ;
        System.out.println(Mystr( n ));
    }
}
