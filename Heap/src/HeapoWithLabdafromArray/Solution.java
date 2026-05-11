package HeapoWithLabdafromArray;

import java.util.PriorityQueue;

public class Solution {

    public static void heap(int []arr ) {

        PriorityQueue<Integer>minHeap = new PriorityQueue<>(
                (a , b ) ->  b -a
        ) ;
       int last  =  arr.length -1  / 2 ;

        for (int i =last ; i>=0 ; i--   ) {

        }
        System.out.println(minHeap.peek());
    }

    public static void main(String[] args) {
        int[]arr = { 1,2,3,4,5,6} ;
        heap(arr) ;

    }
}