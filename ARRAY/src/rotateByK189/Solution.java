package rotateByK189;

public class  Solution {
    public static void  rotareHelping ( int nums []  , int i  , int  j   ) {

        while( i!= j ) {
            int tem  = nums[i] ;
            nums[i] = nums[j] ;
            nums[j]  = tem ;
            i++  ;
            j--  ;
        }
    }
    public static  void rotate(int[] nums, int k) {
        int len  = nums.length ;
        k =  k % len  ;
        rotareHelping(nums , 0 ,len-1 ) ;
        rotareHelping( nums , 0 , k-1  ) ;
        rotareHelping(nums ,  k  , len  -1 ) ;
    }

    public static void main(String[] args) {
        int []  arr  ={ 1,2,3,4,5,6,7} ;
        rotate(arr , 3 );
        for( int num  : arr ) {
            System.out.println(num + " ");
        }
    }
}