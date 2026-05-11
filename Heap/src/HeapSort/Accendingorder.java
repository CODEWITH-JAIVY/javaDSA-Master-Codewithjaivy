package HeapSort;

public class Accendingorder {
    public  static void  heapyfy ( int [] arr , int i , int len ) {

        int largest =  i ;
        int left = 2*i +1 ;
        int right = 2*i+2 ;

        // left cheak
        if( left < len && arr[left] > arr[largest]) largest = left ;
        // right cheak
        if( right < len && arr[right] > arr[largest])  largest = right ;

        // cheak if the largest or i is not same
        if( i!= largest ) {
            swap(arr , i , largest );
            heapyfy(arr , largest , len );
        }
    }

    public  static void swap( int [] arr , int i , int j ) {
        int temp  = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static void Assending(int []arr  )  {
        // heapfy with buttom approach
        int len = arr.length ;
        for( int i = len/2 -1   ; i>=0 ; i--  ) {
            heapyfy(arr , i , len ) ;
        }
        //  updating the max element form the last elemtn
        for (int i = len-1 ; i>0  ; i-- ) {
            swap( arr ,  0 , i ) ;
            heapyfy ( arr ,0 , i ) ;
        }
    }
}