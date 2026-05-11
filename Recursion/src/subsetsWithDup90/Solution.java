package subsetsWithDup90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
   static void SetComination( int []arr, int start  , List<List<Integer>>Ans ,List<Integer> com  )  {
      Ans.add(new ArrayList<>(com)) ;
        for (int i = start; i <arr.length; i++) {
              // skip duplicate
            if( i > start &&  arr[i] > arr[i-1]) continue; ;
             com.add(arr[i]) ;
             // call for the include
            SetComination(arr , i+1 , Ans , com  );
            com.remove(com.size()-1) ;
        }
    }
    public  static  List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> Ans  = new ArrayList<>() ;
        List<Integer>  com  = new ArrayList<>() ;
        Arrays.sort(nums) ;
        SetComination( nums , 0 , Ans , com  ) ;
        return  Ans  ;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2 } ;
         List< List<Integer>> ans = subsetsWithDup(arr ) ;
        System.out.println(ans);
    }
}