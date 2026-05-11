 public class SelectionSort {

     public  static  void  swap   ( int[] arr , int i  , int j   ) {
           int tem = arr[i]   ;
           arr[i]   = arr[j]  ;
           arr[j]  = tem  ;
     }
    public  static void SortSelection ( int [] arr ) {
    int n  = arr.length  -1  ;
    int temp  = 0  ;
    for ( int i =0  ; i<n-1  ;  i++ ) {
        temp  = i ;
        for( int j =i+1 ; j<=n  ; j++ ) {
            if( arr[j] < arr[temp]  ) {
                temp  =  j  ;
            }
            if( temp != i ) {
                swap(arr , i , temp );
            }
        }
    }


    }

    public static void main(String[] args) {
        int arr []   =  { 1,2,3,9,6,5,4,0} ;
         SortSelection  ( arr )  ;
        for( int n  : arr ) {
            System.out.print(n + " ");
        }

    }
}