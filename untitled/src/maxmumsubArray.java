public class maxmumsubArray {
    int maxSubarraySum(int[] arr) {
        int maxsum  = 0  ;
        for ( int i =0 ; i< arr.length-1 ; i++ ) {
            int sum   = 0  ;
            for( int j = i ;  j < arr.length ; j++   ) {
                sum +=  arr[j] ;
            }
            if( maxsum  < sum ) {
                maxsum = sum  ;
            }
        }
        return maxsum  ;
    }

    public static void main(String[] args) {
        int []arr = { 2, 3, -8, 7, -1, 2, 3 } ;
        maxmumsubArray ref  = new maxmumsubArray() ;
        int Maxsum  = ref.maxSubarraySum(arr);
        System.out.println(Maxsum);
    }
}


