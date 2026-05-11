public class variableState {

    public static void  max( int[]  val ) {
       val[0] = 10  ;
    }
    public static void  max1(int val ) {
        val = 10  ;
    }
    public static void main(String[] args) {
        int val1 = 5  ;
         int [] val  = {10} ;
         max1(val1) ;
        System.out.println(val1);
        max( val ) ;
        System.out.println(val[0]);
    }
}
