package MaxHeapinOrderofNtimecomplexity;

public class Solution {
    public  static  void  swap ( int [] arr , int i , int j  ) {
        int tem = arr[i] ;
        arr[i] = arr[j]  ;
        arr[j] = tem ;
    }
 public static void heappify( int [] arr , int  i , int len ) {
     int largest =  i    ;
     int left  = 2 * i +1  ;
     int right  = 2 * i  +2  ;
      // left cheak
      if( left <  len && arr[left] > arr[largest])  largest =  left ;

      // right  cheak
     if( right  <  len  && arr[right] > arr[largest])  largest  = right   ;

     //  heapy fy
     if(  i!= largest ) {
         swap( arr , i ,largest ) ;
         heappify(arr , largest  , len );
     }

 }
    public static void buildMaxHeap( int []arr ) {
        int len =arr.length ;
        for( int i  = len/2 -1  ; i>= 0  ; i -- ) {
            heappify(arr , i , len) ;
        }
    }



    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 4, 2, 3, 7, 8, 9, 10};
        buildMaxHeap(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}