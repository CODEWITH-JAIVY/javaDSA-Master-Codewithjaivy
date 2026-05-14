package DuplicationElement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    /// Find duplicate elements in an array

    public static int findDuplicate(int arr[]  ) {
         int n  = arr.length ;
        Arrays.sort(arr) ;
         for(int i  =1 ; i< n  ; i++  ) {
              if(arr[i] == arr[i-1]) {
                  return  arr[i] ;
              }
         }
         return  0  ;
    }
    public static void main(String[] args) {
        int [] arr  = {1, 3, 4, 2, 3, 1, 5}  ;
        int ans  = findDuplicate(arr) ;
        System.out.println(ans);
    }
}