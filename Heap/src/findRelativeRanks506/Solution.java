package findRelativeRanks506;

import java.util.PriorityQueue;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n  = score.length ;
        String[] ans  = new String  [n ] ;

        PriorityQueue<int[]>minheap = new   PriorityQueue <>(
                (a , b ) -> b[0] - a[0]
        ) ;

        for( int i = 0 ; i < n  ; i++ ) {
            minheap.offer(new int []{score[i] , i }) ;
        }

        int rank = 1  ;
        while(!minheap.isEmpty() ) {
            int[]curr  = minheap.remove() ;
            int index     = curr[1] ;
            if( rank == 1 ) {
                ans[index] = "Gold Medal" ;
            }else if( rank == 2 ) {
                ans[index] = "Silver Medal";
            }else if( rank == 3 ) {
                ans[index ]  ="Bronze Medal" ;
            }else {
                ans[index] = Integer.toString(rank);
            }
          rank ++ ;
        }
        return ans  ;
    }

    static void main() {
        Solution solution = new Solution() ;
        int []arr = { 10,5,0,4,8} ;
        String [] ans  = new String[arr.length] ;
        ans  = solution.findRelativeRanks(arr) ;
        for(String val  : ans ) {
            System.out.print(val + " ");
        }
    }
}