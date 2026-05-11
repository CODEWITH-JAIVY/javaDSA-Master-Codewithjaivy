package com.combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public static void  backtracing( int []arr ,int start  ,List<Integer> com ,List<List<Integer>> ans , int target  ) {
        // base condition

        if( target ==0 ) {
            ans.add(new ArrayList<>(com)) ;
            return; // copy of the com in ans
        }
        for( int i = start ; i < arr.length ; i++ ) {
//            if( arr.length == i   && target<0  ) {
//                return;
//            }
            // skip duplicate element
            if(i> start  &&  arr[i] == arr[i-1]) {
                continue;
            }
            if (arr[i] > target) break;
            // add every elemen to make a set in com
            com.add(arr[i]) ;
            // call the recustive to make all the set from the which index you are  corrently
            backtracing(arr ,i+1 , com , ans , target - arr[i]);
            com.remove(com.size() -1 ) ;
        }
    }
    public static  List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>()  ; // final set
        List<Integer>com = new ArrayList<>() ; //  making set
        Arrays.sort(arr);
        backtracing( arr , 0 , com , ans , target  ) ;
        return  ans ;
    }

    public static void main(String[] args) {
        int [] arr  = {10,1,2,7,6,1,5} ;
        List<List<Integer>> ans = combinationSum2(arr , 8 ) ;
        System.out.println(ans );
    }
}
