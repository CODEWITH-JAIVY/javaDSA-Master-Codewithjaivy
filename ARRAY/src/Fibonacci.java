public class Fibonacci
{
    // Write Fibonacci number generator. First naive recursive,
    // then optimize with memoization. What is the difference in time complexity?

    // 0 1 1 2 3 5 8 13

    public static  int  fibonacchi(int n  ) {

     if(n == 0 ||  n ==1  ) return n     ;

     return  fibonacchi(n-1) + fibonacchi(n-2) ;

    }

    public static void main(String[] args) {
        int ans  =  fibonacchi(5  );
        System.out.println(ans );
    }

}