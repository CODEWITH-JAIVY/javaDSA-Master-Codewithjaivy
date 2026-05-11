public class oddevenCount {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9,10 } ;
        int oddcount = 0 ;
        int EvenCount  = 0 ;
        int i  = 0  ;
        while (i  <= arr.length -1 ) {
            if (arr[i] % 2 != 0 ) {
                EvenCount++ ;
            }else {
                oddcount ++ ;
            }
            i++ ;
        }
        System.out.println("Odd count number is " + oddcount );
        System.out.println("Even number count is " + EvenCount );
    }
}
