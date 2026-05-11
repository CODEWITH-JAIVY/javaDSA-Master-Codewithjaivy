public class Daimondshape {

     public  static int[]   print( int[] n ) {
//         for (int i = 1; i <=n ; i++) {
//             for (int j = 1; j <= n-i ; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 0; k <2*i-1 ; k++) {
//                 System.out.print(" * ");
//             }
//             System.out.println(" ");
//         }
//         n += 10  ;
//         return n  ;
         for (int val  : n ) {
             val  = val * 2 ;
         }
         return  n  ;
     }
    public static void main(String[] args) {
        int []n = { 1 , 2 , 3}  ;
       int [] res =  print(  n );
        for(int num  : res  ) {
            System.out.println(num );
        }
    }
}
