package kthSmallestElement;


import QuickSort.Solution;

import static QuickSort.Solution.Partition;

public class secondSolutionusingQuickSort {

    public static int quickSortAlgo ( int  [] arr , int kth, int start   , int end ) {
        if(start<= end ) {
            int pivatIndex  = Solution.Partition(arr , start , end ) ;
            int n  = arr.length;
//            int k = n -kth ; // for the kth largest element
            int k  = kth-1 ; // kth smallest element

            if(k == pivatIndex ) {
                return   arr[pivatIndex] ;
            }else if(pivatIndex > k ) {
              return   quickSortAlgo(arr , kth , start , pivatIndex-1) ;
            }else  {
                return quickSortAlgo(arr , kth , pivatIndex+1  , end ) ;
            }
        }
        return -1 ;
    }
    public static int kthLargestElemetn(int []arr  , int target) {

        return  quickSortAlgo( arr , target  ,  0 , arr.length-1);
    }

    public static void main(String[] args) {
        int []arr = { 1,2,0,3,5,6,8,10} ;
        // 0 1 2 3 5 6 8 10
        int res  = kthLargestElemetn(arr , 3 ) ;
        System.out.println(res );
    }
}
