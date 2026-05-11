public class Sum_of_digits_of_a_number {
//Input → 1234 → Output → 10
    public static int  digitsum(int num ) {

        // base case
        if ( num <= 0 ){
            return 0 ;
        }
        int rem = num % 10 ;
        int rest   = num / 10 ;
         return rem + digitsum(rest) ;

    }
    public static void main(String[] args) {
        int sum = digitsum(1234) ;
        System.out.println( sum );
    }
}
