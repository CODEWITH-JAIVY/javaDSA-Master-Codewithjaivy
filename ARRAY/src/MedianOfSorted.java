public class MedianOfSorted {
    public  static int median(int [] arr ) {
        int sum = 0 , count = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            sum  += arr[i] ;
            count++ ;
        }
        return  sum/ count ;
    }
    public static void main(String[] args) {
        int []arr = { 2, 4, 6, 8, 10, 12 } ;
        double result = median( arr )  ;
        System.out.println("Median of the array " + result );
    }
}
