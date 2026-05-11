 import java.util.Scanner;

public class UpperBound {

    public static int BinarySearchUpper(int []arr ,int  key )  {
        int start  = 0 , end  = arr.length -1  ;
        while (start < end ) {
           int mid  = start +  ( end - start ) / 2  ;
           if( arr[mid] <= key  ) {
               start = mid+ 1  ;
           }else  {
               end  = mid - 1  ;
           }
        }
        return  start -1 ;
    }

    public static void main(String[] args) {
        int []arr  = { 1,2,2,3,4,5,5,6,7,8,8,9,9} ;
        Scanner scanner = new Scanner(System.in ) ;
        int key ;
        System.out.println( "Enter value to search the upper bound ");
        key = scanner.nextInt() ;
        int result_index =  BinarySearchUpper(arr , key ) ;
        if( result_index < arr.length   ) {
            System.out.println("The Given Element " +  key +   "Is found at the index " + result_index );
        }else  {
            System.out.println("Element is not found ");
        }
        scanner.close();
    }
}
