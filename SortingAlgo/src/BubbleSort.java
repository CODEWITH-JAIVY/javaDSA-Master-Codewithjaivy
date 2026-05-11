public class BubbleSort {
public  static  void Sort (int [] arr ) {
   int n  = arr.length -1 ;
 for( int i =0 ; i< n  ;  i++ ) {
     for( int j =0  ; j< n  ; j++  ) {
         if( arr[j+1] < arr[j]) {
             swap(arr, j  , j+1 );
         }
     }
 }
}
 public  static  void  swap( int arr[]  , int  num1 , int num2) {
    int tem = arr[num1] ;
    arr[num1] = arr[num2] ;
    arr[num2] = tem  ;
 }

    public static void main(String[] args) {
        int [] arr  = { 3,2,4,1} ;
       Sort( arr ) ;
         for (int e  :  arr  ){
             System.out.print(e + " ");
         }

    }
}