import java.util.Arrays;

public class RemoveDuplicate27 {
    public static int remove(int []nums , int val )  {
         int k  =0 ;
         for( int i = 0 ; i< nums.length  ; i++ ) {
             if( nums[i]!= val ) {
                 nums[k] = nums[i] ;
                 k++ ;
             }
         }
         return k ;
    }

    static  int removeAfterSortign(int [] arr , int k ) {
        Arrays.sort(arr);
        int start = 0 ;
        int end = arr.length -1  ;
        int mid  =  (start +  end ) / 2 ;
        int j = 0 ;
        for(int i  = 0 ;i<arr.length ; i++ ) {
            if(arr[i] != arr[mid]) {
                j ++ ;
            }
        }
return  j ;
    }

    public static void main(String[] args) {
        int []nums = { 1,2,2,3,4,0,2};
//        int  k  =  remove(nums ,  2 ) ;
       int k  = removeAfterSortign( nums, 2) ;
        System.out.println(Arrays.toString(nums));
        System.out.println(k );
    }
}
