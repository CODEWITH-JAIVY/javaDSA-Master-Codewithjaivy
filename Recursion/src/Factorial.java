public class Factorial {
     public static  int fac ( int nums  ) {
         if( nums == 1 ) {
             return  1  ;
         }
         return  nums * fac(nums-1 ) ;
     }

    public static void main(String[] args) {
      int res = fac(5) ;
        System.out.println(res);
    }
}