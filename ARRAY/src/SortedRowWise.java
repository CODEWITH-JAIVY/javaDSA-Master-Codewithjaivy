import java.util.Arrays;
import java.util.Scanner;

public class SortedRowWise {

    public static  int binarysearch( int []arr ,int  target )  {
        int start =0 , end = arr.length -1  ;
        while( start <= end ){
            int mid = start +( end - start ) / 2 ;
            if( arr[mid] == target ) {
                return  mid  ;
            }else  if( arr[mid] > target ) {
                end = mid -1  ;
            }else  {
                start = start +1  ;
            }
        }
        return  -1 ;
    }

    public static int TwoDArraySearchingALgo( int [][]arr , int target ) {
        int result = -1 ;
        for (int i = 0; i < arr.length; i++) {
            if(result!= -1)
            {
                return  result ;
            }
                result = binarysearch( arr[i] , target ) ;

        }
    return  result ;
    }
    public static void main(String[] args) {
        int [][] TwoDArray  = {  {1,2,3,4}, {10,13,14,15,}, { 15,17,13,161}, {3,6,9,10}, {8,9,10,151 }} ;
        int target  ;
        Scanner scanner = new Scanner(System.in)  ;
        target = scanner.nextInt() ;
        int result = TwoDArraySearchingALgo( TwoDArray , target )  ;
                if(result != -1) {
                    System.out.println("Elemnt is found ");
                }else  {
                    System.out.println("No  found ");
                }
    }
}
