import java.util.Scanner;
public class LowerBond {
    public  static  int BinarySearch( int [] arr , int start , int end , int key  ) {
//        int lower  = end ;
        while (start <= end ) {
            int mid  = start+ ( end - start ) / 2  ;
            if( arr[mid] >= key ) {
                end = mid -1 ;
            }else  {
                start =  mid +1 ;
//                lower = start  ;
            }
        }
        return  start   ;
    }
    public static void main(String[] args) {
        // find the lower bound of the given key in the sored array there is duplicate element
        int[] arr = {1, 15, 15, 15, 15, 20, 20, 20, 20, 20};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Searching element ");
        int key = scanner.nextInt();
        int start = 0, end = arr.length - 1;
        int result_Index = BinarySearch(arr, start, end, key);
        if (result_Index < arr.length) {
            System.out.println("The lowest element if found at the index " + result_Index);
        }else  {
            System.out.println("Element is not found ");
        }
    }
}
