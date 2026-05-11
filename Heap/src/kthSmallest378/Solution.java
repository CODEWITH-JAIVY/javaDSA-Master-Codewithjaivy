package kthSmallest378;

import java.util.PriorityQueue;

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ;

        for( int i =0 ; i< matrix.length ; i++ ) {
            for( int j =i ; j<matrix[i].length  ; j++ ) {
                minHeap.offer(matrix[i][j]) ;

            }
        }
        while( !minHeap.isEmpty() ) {
            minHeap.remove() ;
            if(k == minHeap.size() ) break  ;
        }
        return minHeap.peek() ;
    }
}