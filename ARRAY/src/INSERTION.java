import com.sun.jdi.PathSearchingVirtualMachine;

import java.lang.reflect.Array;
import java.util.Arrays;

public class INSERTION {
   public static void main(String[] args) {
//        int []arr = new int [50] ;
////        int []arr = { 1,2,3,4,5,6} ;
//        int size  = 0 ;
//
//          arr[size++] = 1  ;
//          arr[size++] = 2 ;
//          arr[size++ ] = 3  ;
//
//        System.out.println(arr);
//        for (int i : arr ) {
//            System.out.println(i  );
//        }
//        System.out.println("Actual array  before the inseting the array  ");
//        for (int i = 0; i <  size ; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(" \n After the inserting the element  in the array   ");
//
//        int index = 0  ;
//        int x = 200 ;
//        for ( int i = size  ; i >  index  ; i-- ) {
//            arr[i] = arr[i-1] ;
//        }
//
//        size++   ;
//        System.out.println(arr[0]);
//
//        arr[index] = x ;
//        for (int i = 0; i < size ;i++) {
//            System.out.print(arr[i] + " ");
//        }

    int [] arr =  new int[20] ;
    arr[0] = 1 ;
    arr[1] =2   ;
    arr[2] = 3  ;
    arr[3] = 4 ;
    for( int  i  : arr ) {
        System.out.print (i  + "  ");
    }
    int count = 0  ;
    for (int i  =0  ; i < arr.length ; i ++ ) {
         if(arr[i]  != 0 ) {
             count++ ;
         }
    }
       System.out.println(count );
       for (int i = 0; i < count; i++) {
           System.out.print( arr[i] + " ");

       }
    }
}
