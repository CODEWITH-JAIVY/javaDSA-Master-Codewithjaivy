package com.ToweOfHoini;

public class TowerOfhonie {


        static int count  =0   ;
        public static void   towerOfHanoi(int n, char s, char h, char  d) {
            // code here
            if( n == 0 ) return   ;
            towerOfHanoi(n-1 , s, d , h  ) ;
            System.out.println("Movies " + s +" TO  " + d  );
            count ++ ;
            towerOfHanoi( n -1 , h ,s  , d  ) ;

        }



    public static void main(String[] args) {
        int n  =3;
        towerOfHanoi( n , 's' , 'h' ,'d') ;


    }
}
