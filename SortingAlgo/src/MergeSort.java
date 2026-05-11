public class MergeSort {

    public static  void  mergeSot( int [] arr , int start , int end ) {
        if(start < end ) {
            return;
        }
        int mid =  start + ( end  - start  ) / 2  ;

        mergeSot(arr ,start  , mid );
        mergeSot(arr , mid+1 , end );
        merge( arr , start , mid ,end ) ;
    }

    public  static  void  merge( int [] arr , int start , int mid , int end ) {
        int [] temp  = new int[end-start] ;
        int i  = start  ;
        int j = mid+1  ;
        int k  = 0  ;
        while (i <= j  && j < end  ) {
            if(arr[i] < arr[j] ) {
                temp[k++] = arr[i++] ;
            }else if( arr[j] < arr[end ] ) {
                temp[k++] = arr[j++] ;
            }
        }
      while (i< mid ) {
          temp[k++] = arr[i++] ;
      }
      while (j<end) {
          temp[k++] = arr[j++] ;
      }

    }
    

}