package QuickSort;

public class Solution {
    private static void Swap( int arr [] , int start , int end ) {
        int temp = arr[start] ;
        arr[start] = arr[end] ;
        arr[end] = temp  ;
    }
  public static int Partition(int [] arr , int start  , int end ) {
  int pivot = arr[end];
      // we can chose the last ,  first   , and the  ( medain   of the tree mid of the start and end , or start , end
      int i = start-1  ;

      for( int j = start ; j < end  ; j++  ) {
          if( arr[j] < pivot) {
              i++ ;
              Swap (  arr , i , j ) ;
          }
      }
      Swap( arr , i+1  , end) ;
      return i+1 ;

  }

    public static void quickSortHelper( int []arr , int start  , int end ) {
        if(start< end) {
            int pivot  = Partition( arr ,  start , end) ;
            quickSortHelper(arr , start , pivot-1);
            quickSortHelper(arr , pivot+1  , end );
        }
    }


    public static void quickSort(int []arr)  {
      quickSortHelper(arr ,  0 , arr.length-1);
    }

    public static void main(String[] args) {
        int [] arr ={1,0,2,3,5,6,8,9,4} ;
        quickSort(arr) ;

        for( int val  : arr ) {
            System.out.print(val + " ");
        }
    }
}
