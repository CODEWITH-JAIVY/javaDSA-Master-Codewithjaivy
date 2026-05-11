public class SumOfNnaturalNumber {
     public  static  int sum ( int nums ) {
         if( nums == 0 ) {
             return  0  ;
         }
         return  nums + sum(nums -1 ) ;
     }

    public static void main(String[] args) {
        int res  = sum(5 ) ;
        System.out.println(res);
    }
}