package RearangeArray;

import java.util.Arrays;

public class Solution {
    //input  = {  1,2,3,4,5,6,7  }
    //output  = {  7,1,6,2,5,3,4)

    public static int[] rearrange (int arr []) {
        Arrays.sort(arr);
        int start  = 0  ;
        int end  = arr.length -1 ;
        int res [] = new int [arr.length] ;
        int k = 0  ;
        while( start <= end  ) {
            res[k++] = arr[end--] ;
            if(start<= end) {
                res[k++] = arr[start++] ;
            }
        }
        return res  ;
    }

    public static void main(String[] args) {
        int arr [] = { 1,2,3,4,5,6,7} ;
        int res[] = rearrange( arr ) ;
        for( int val : res ) {
            System.out.print(val+" ");
        }
    }
}
