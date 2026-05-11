public class Longest_Subarray_with_SumK {
    public static int lonestSubarray(int[] arr, int k) {

        int sum = 0 , maxlen =0 , count = 0 , i =0 , j =0  ;
      while( j < arr.length ) {
          sum +=  arr[j] ;

          // shrink the subarray
          while( sum > k && i <= j ) {
              sum -= arr[j] ;
              i++ ;
          }
          // add the incoming array
          if( sum <= k ) {
             maxlen  = Math.max(maxlen , j -i + 1 ) ;

          }
          j++ ;
      }
return maxlen ;
    }

    public static void main(String[] args) {
        int  [] arr  = { 1,2,1,0,1,1,0} ;
        int lonestSubArrayLenght  = lonestSubarray(arr  , 4 ) ;
        System.out.println("The  logest subarray lenght " + lonestSubArrayLenght );
    }
}
