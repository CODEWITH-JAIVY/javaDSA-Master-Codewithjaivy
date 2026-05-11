public class problem7 {
    public  static  void  fun( int n ) {
        if( n ==0  )  return;
        System.out.print (n  + " ");
        fun(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n =  2  ;
        fun(n) ;
    }
}
