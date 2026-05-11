package com;

class myPow {
    public static double  Helper (double  x , long N  )  {
        if(x == 0  ) return 0  ;
        if( N == 0 ) return 1  ;
        if(N % 2  == 0  ) {
            return   Helper(x*x , N / 2 ) ;
        }else  {
            return x * Helper( x * x , (N-1) / 2 ) ;
        }
    }
    public static double mypow(double x, int n) {
        long N  = n  ;
        double result  = Helper ( x , N  ) ;
        if(n < 0 ) return 1/result ;
        else
            return result  ;
    }

    public static void main(String[] args) {
        double ans  = mypow( 2 , -3 ) ;
        System.out.println(ans);
    }
}