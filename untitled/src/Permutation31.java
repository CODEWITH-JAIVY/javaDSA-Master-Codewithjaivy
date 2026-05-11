public class Permutation31 {

    public void nextPermutation(int[] nums) {
        int n = nums.length  ;
        int i = n-2 ;
        // pivot element
        while( i>=0 && nums[i] >= nums[i+1]) {
            i-- ;
        }
        // after pivot element search on the right side from the pivot element
        if(i>=0 ) {
            int j = n-1  ;
            while( nums[j] <= nums[i] ) {
                j-- ;
            }
            swap(nums , i , j ) ;
        }
        reverce ( nums , i+1 , n-1) ;
    }
    public void swap( int nums []  , int i,  int j  ) {
        int temp  = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = temp  ;
    }
    public void reverce( int []  nums , int start  , int end  ) {
        while( start < end ) {
            swap( nums , start, end ) ;
            start ++ ;
            end --  ;
        }
    }
}