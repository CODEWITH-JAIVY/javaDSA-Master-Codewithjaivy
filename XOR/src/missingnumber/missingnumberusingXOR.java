package missingnumber;

public class missingnumberusingXOR {

     public  static  int missing (int [] arr , int n ) {

         int XORall = 0  ;
         for (int  i = 1;  i <=n ;  i++) {
             XORall ^= i  ;
         }
         int XORarr  = 0 ;
         for( int num : arr ){
             XORall ^= num ;
         }
         long max = Long.MAX_VALUE ;
         return  XORall ^ XORarr ;

     }

    public static void main(String[] args) {
        int n = 5  ;
        int [] arr  = {  1,2,4,5} ;
        int res  = missing( arr , n ) ;
        System.out.println(res);
    }
}
