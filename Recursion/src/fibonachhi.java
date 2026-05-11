public class fibonachhi {
 public  static  int Fibonacci( int n ) {
     if ( n == 0 ||  n == 1  ) {  return  n ; }
     return  Fibonacci(n-1 ) + Fibonacci(n-2) ;
 }

    public static void main(String[] args) {
        int n  = 5  ;
        System.out.println(Fibonacci (n ));
    }
}
