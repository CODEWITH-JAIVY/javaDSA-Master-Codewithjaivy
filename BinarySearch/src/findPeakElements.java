public class findPeakElements
{
    public  static   int findPeakElement(int[] nums) {
    int start  = 0  ;
    int end   = nums.length-1  ;
    int ans = 0  ;
    while( start <= end ) {
        int mid  = start  + (end - start ) /2 ;
        if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1] ) {
            ans  =    mid  ;
        }else if( nums[mid] <= nums[start]) {
            start = mid +1  ;
        }else {
            end = mid-1 ;
        }
    }
    return ans  ;
}

    public static void main(String[] args) {
         int arr[] = {1,2,1,3,5,6,4} ;
         int ans = findPeakElement(arr) ;
        System.out.println( "Index :-  " + ans  );
    }
}