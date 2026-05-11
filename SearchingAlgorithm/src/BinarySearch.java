import java.util.Scanner;

public class BinarySearch {
    //for the acceding order
    public static  int BinarySearchAlAcending(int []arr  ,int start , int end , int key  )  {
           if(start > end  ) { //  base case termination condition
               return -1  ;
           }
          int mid = start+(start - end) / 2  ;
          if(arr[mid] == key  ) {
              return  mid ;
          }
          if(arr[mid] < key  ) {
            return  BinarySearchAlAcending(arr , mid+1 , end , key  ) ;
          }else {
            return   BinarySearchAlAcending (arr , start , mid-1 , key ) ;
          }
    }

    // this is for the when the array is in Decending order
    public static int BinarySearchAlDecending( int []arr  , int start , int end , int key )  {
        while (start <= end ) {
            int mid = start + ( end - start) / 2 ;
            // if the element is found
            if( arr[mid] == key ) {
                return  mid  ;
            }
            else if ( arr[mid] > key ) {
                start = mid +1  ;
            }else  {
                end = end -1  ;
            }
        }
        return  -1 ;
    }

    public  static int binary( int [] arr  , int key ) {
      int start = 0 ;
      int end = arr.length-1  ;
      boolean isAcesding = false ;
//        System.out.println("End  = "  +  end );
      try {
          if(arr.length == 0 ) {
              throw new Exception("Array is empty ") ;
          }
          if( arr[start] < arr[end]) {
              isAcesding = true ;
          }
         if(isAcesding) {
             System.out.println("This  Binary search have been done in the Accending order ");
             return BinarySearchAlAcending (arr, start, end ,key );
         } else  {
             System.out.println("This is done in the Decending order ");
             return  BinarySearchAlDecending( arr  , start , end , key ) ;
         }
      } catch (Exception e ) {
          System.out.println(e.getMessage());
      }
      return  -1  ;
    }

    public static void main(String[] args) { // binary search always work on the sorted data
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element to searach ");
        key = scanner.nextInt();
        int result = binary(arr, key);
        System.out.println(result);
        if (result != -1) {
            System.out.println(" Element is  found at index " + result);
        } else {
            System.out.println("Element is not found ");
        }
    }
}
