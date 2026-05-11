public class Count_digits_in_a_number {
    //Input → 12345 → Output → 5
    public static int Count(int num ) {
        int count = 0 ;
        if(num == 0 ) {return  0 ; }
        int rem = num % 10 ;
        int rest = num / 10  ;
        count++ ;
        return  count +   Count(rest) ;


    }

    public static void main(String[] args) {
        int count = Count(12345) ;
        System.out.println(count);
    }
}
