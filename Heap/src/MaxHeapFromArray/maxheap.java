package MaxHeapFromArray;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class maxheap {

    public static void swap( int [] arr , int i , int j  ) {
        int temp  = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp  ;
    }
    public static void buildMaxHeap(int [] arr ) {
         for( int i =0 ; i< arr.length ; i++ ) {
             int maxIndex  = i  ;
             while(true) {
             if( maxIndex!= 0 && arr[maxIndex] > arr[(maxIndex-1 )/ 2 ]) {
                 swap(arr, maxIndex, (maxIndex - 1) / 2);
                      maxIndex = (maxIndex-1) / 2  ;
             } else {
                 break;
             }
             }
         }
//        System.out.println(arr[0]);

    }
     public static void reverse(int []arr) {
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
         for (int i = 0; i < arr.length ; i++) {
             pq.add(arr[i]) ;
         }
         while(!pq.isEmpty()) {
             System.out.print(pq.remove()+" ");
         }
     }
    public static void main(String[] args) {
        int  [] arr  = {  1,2,5,6,7,8,9 } ;
        buildMaxHeap(arr ) ;
        System.out.println("Max Element  of the Array is " +  arr[0]);
        for( int val : arr ) {
            System.out.print(val + " ");
        }
        System.out.println();
        int  [] arr1  = { 100,22,4, 1,2,5,6,7,8,9 } ;
        System.out.println("with the help of the Priority Queue reverse the array ");
        reverse(arr1) ;
    }
}